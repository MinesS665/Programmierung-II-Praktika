package lesen;

public class GPSPoint {
	
	public double lon;
	public double lat;
	
	public GPSPoint(double lat, double lon) {
		this.lat = lat;
		this.lon = lon;
	}
	
	public String toString() {
		return "Lat:" + this.lat + " : Lon:" + this.lon;
	}
}