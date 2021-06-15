package com.app.problems;

import java.awt.geom.Point2D;
import java.util.List;

public class AirTrafficControl {
	public double minDistance(List<Point> allPlanes) {
		double minDistance = Double.MAX_VALUE;
		for(Point p1 : allPlanes) {
			for(Point p2 : allPlanes) {
				double d = p1.distanceTo(p2);
				if(d!=0 && d<minDistance)
					minDistance = d;
			}
		}
		return minDistance;
	}
}
