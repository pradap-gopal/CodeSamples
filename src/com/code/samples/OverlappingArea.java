package com.code.samples;

public class OverlappingArea {
	
	public static int overlappingArea(int[] rect1BottomLeft, int[] rect1TopRight, 
			int[] rect2BottomLeft, int[] rect2TopRight) {
		
		int [] topRectTop = {};
		int [] bottomRectTop = {};
		int [] topRectBottom = {};
		int [] bottomRectBottom = {};
		
		if(rect1TopRight[0] > rect2TopRight[0]) {
			topRectTop = rect1TopRight;
			bottomRectTop =  rect2TopRight;
			topRectBottom = rect1BottomLeft;
			bottomRectBottom = rect2BottomLeft;
		} else {
			topRectTop = rect2TopRight;
			bottomRectTop =  rect1TopRight;
			topRectBottom = rect2BottomLeft;
			bottomRectBottom = rect1BottomLeft;
		}
		
		int lengthDiff = bottomRectTop[0] - topRectBottom[0];
		int widthDiff = bottomRectTop[1] - topRectBottom[1];
		if( lengthDiff > 0 && widthDiff >0) {
			return lengthDiff*widthDiff;
		}
		
	return 0;
        
    }
	
	public static void main(String [] args) {
		int [] rect1BottomLeft = {2,2};
		int [] rect1TopRight = {5,5};
		int [] rect2BottomLeft = {1,1};
		int [] rect2TopRight = {4,4};
		
		System.out.println(overlappingArea(rect1BottomLeft, rect1TopRight, rect2BottomLeft, rect2TopRight));
		
		rect1BottomLeft[0] = 1;
		rect1BottomLeft[1] = 1;
		rect1TopRight[0] = 4;
		rect1TopRight[1] = 4;
		rect2BottomLeft[0] = 2;
		rect2BottomLeft[1] = 2;
		rect2TopRight[0] = 5;
		rect2TopRight[1] = 5;
		
		System.out.println(overlappingArea(rect1BottomLeft, rect1TopRight, rect2BottomLeft, rect2TopRight));
		
		rect1BottomLeft[0] = 1;
		rect1BottomLeft[1] = 1;
		rect1TopRight[0] = 4;
		rect1TopRight[1] = 4;
		rect2BottomLeft[0] = 5;
		rect2BottomLeft[1] = 5;
		rect2TopRight[0] = 7;
		rect2TopRight[1] = 7;
		
		System.out.println(overlappingArea(rect1BottomLeft, rect1TopRight, rect2BottomLeft, rect2TopRight));
	}

}
