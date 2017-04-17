package com.albion.classics.pascal;

import org.testng.annotations.Test;

import java.util.ArrayList;

public class TriangleTest {

  @Test
  public void testGenerate() {
      Triangle tri = new Triangle();
      ArrayList<ArrayList<Integer>> x = tri.generate(5);
      tri.print(x);
  }
}
