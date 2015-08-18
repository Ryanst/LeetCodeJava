//https://leetcode.com/problems/rectangle-area/
//Find the total area covered by two rectilinear rectangles in a 2D plane.
//
//Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.
//
//Rectangle Area
//Assume that the total area is never beyond the maximum possible value of int.


public class RectangleArea {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area1 = (C-A)*(D-B);
        int area2 = (G-E)*(H-F);
        if(E>=C || A>=G || F>=D || B>=H)
        	return area1+area2;
        
        int length = Math.min(C, G) - Math.max(A, E);
        int height = Math.min(D,H) - Math.max(B, F);
        
        return area1 + area2 - length*height;
    }
}
