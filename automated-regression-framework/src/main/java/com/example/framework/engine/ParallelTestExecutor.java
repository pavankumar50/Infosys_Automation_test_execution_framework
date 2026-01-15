package com.example.framework.engine;
import java.util.concurrent.*;
public class ParallelTestExecutor {
 public void run(Runnable r,int n){
  ExecutorService ex=Executors.newFixedThreadPool(n);
  for(int i=0;i<n;i++) ex.submit(r);
  ex.shutdown();
 }
}