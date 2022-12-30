package com.example.corejavaexamplewithstreamapi.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {
  public static class RatingStatisticsCollectorImpl implements RatingStatisticsCollector {

    private final List<Data> listData = new ArrayList<>();
     final class Data{
      private final String app;
      private final int rating;
      Data(String app,int rating){
        this.app=app;
        this.rating=rating;
      }
      public String getApp(){
        return app;
      }
      public int getRating(){
        return rating;
      }

    }
    @Override
    public void putNewRating(String app, int rating){
      if(listData!=null)
        listData.add(new Data(app,rating));

    }

    @Override
    public double getAverageRating(String app){
      final IntStream intStream = listData.stream().filter(f -> f.getApp().equalsIgnoreCase(app))
          .map(Data::getRating).mapToInt(Integer::intValue);
     return intStream.average().getAsDouble();
    }

    @Override
    public int getRatingsCount(String app){
      final long count = listData.stream()
          .filter(f -> f.getApp().equalsIgnoreCase(app)).map(Data::getRating).count();
      return (int)count;
    }
  }

  ////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

  public interface RatingStatisticsCollector {
    // Ratings feed will call this method when new app rating information is received. This is input to your class. ratings is a non negative integer between 0 to 10.
    public void putNewRating(String app, int rating);

    // Report the average rating of the app.
    public double getAverageRating(String app);

    // Report the total number of rating for an app.
    public int getRatingsCount(String app);
  }

  public static void main(String[] args) {
    RatingStatisticsCollector collector  = new RatingStatisticsCollectorImpl();
    collector.putNewRating("Gmail",2);
    collector.putNewRating("Gmail",4);
    collector.putNewRating("Gmail",7);
    collector.putNewRating("Facebook",3);
    collector.putNewRating("Facebook",5);

    System.out.println(collector.getAverageRating("Facebook"));
    System.out.println(collector.getRatingsCount("Facebook"));


  }
}