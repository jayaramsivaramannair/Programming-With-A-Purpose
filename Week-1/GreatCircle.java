/*
The great-circle distance is the length of the shortest path between two points(x1, y1)
and (x2, y2) on the surface of a sphere, where the path is constrained to be along the 
surface. 

Write a program GreatCircle.java that takes four double command-line arguments x1, y1, x2, y2 - the latitude
and the longitude (in degrees) of two points on the surface of the earth - and prints
the great-circle distance (in kilometers) between them. 
Use the Haversine Formula to solve this problem. 

//Sample Input

java GreatCircle 40.35 74.65 48.87 -2.33
java GreatCircle 60.0 15.0 120.0 105.0
*/

public class GreatCircle {
    public static void main(String[] args) {
        double lat1 = Double.parseDouble(args[0]);
        double lon1 = Double.parseDouble(args[1]);
        double lat2 = Double.parseDouble(args[2]);
        double lon2 = Double.parseDouble(args[3]);

        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);

        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);

        double a = Math.pow(Math.sin(dLat / 2), 2) + Math.pow(Math.sin(dLon / 2), 2) * Math.cos(lat1) * Math.cos(lat2);
        double rad = 6371;
        double c = 2 * Math.asin(Math.sqrt(a));
        System.out.println(rad * c + " kilometers");
    }
}
