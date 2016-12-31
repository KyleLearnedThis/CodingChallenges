package com.albion.pascal;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class TriangleTest {

  @Test
  public void generate() {
	  Triangle tri = new Triangle();
	  ArrayList<ArrayList<Integer>> x = tri.generate(5);
	  tri.print(x);
  }
}
