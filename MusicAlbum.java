public class MusicAlbum{

	private String title; //variable to store the title of the album
	private String artistName; //variable to store the name of the artist
	private int noOfTracks; //variable to store the no of track in the album
	private Track tracks[]; //variable to store the tracks

	private class Track{
		public String trackName; //variable to store the name of the track
		public int noOfMinutes; //variables to store the no. of minutest the track will play

		//Private class to store the name of the track and the no of minutes
		public Track(String trackName, int noOfMinutes){
			this.trackName = trackName;
			this.noOfMinutes = noOfMinutes;
		}
		public String toString(){
			String output = "";
			output += trackName + ", " + noOfMinutes + " minutes";
			return output;
		}
	}

	/**A constructor used to initial MusicAlbum objects
	   @param title used to initila the title of the album
	   @param artistName used to initialize the name of the artist
	*/
	public MusicAlbum(String title, String artistName){
		this.title = title;
		this.artistName = artistName;
		this.noOfTracks = 0;
		tracks = null;
	}

	/**
		Method that inserts a track to the album
		@param trackName stores the name of the track
		@param noOfMinutes stores the no. of minutes the track will play
	*/
	public void insert(String trackName, int noOfMinutes){
		this.resize();
		this.tracks[noOfTracks-1] = new Track(trackName, noOfMinutes);
	}

	/**Method used to resize the tracks arra*/
	private void resize(){
		if(this.tracks == null)
			this.tracks = new Track[1];
		else{
			Track[] copy = new Track[noOfTracks + 1];
			for(int i = 0; i < noOfTracks; i++)
				copy[i] = this.tracks[i];
			this.tracks = copy;
		}
		noOfTracks++;
	}
	/*Method used to print the album*/
	public void print(){
		System.out.println("\n---------------------------------------------------------------------------------");
		System.out.println("Title: " + title);
		System.out.println("Artist: " + artistName);
		System.out.println("\nTracks: ");
		for(int i = 0; i < noOfTracks; i++){
			if(tracks[i] != null)
			System.out.println(tracks[i]);
		}
		System.out.println("-----------------------------------------------------------------------------------");
	}

	//A method used to sort the tracks in alphabetical order
	public void sortTracksAlphabetically(){
		for(int i = 0; i < noOfTracks-1; i++){
			if(tracks[i].trackName.compareTo(tracks[i+1].trackName) > 0){
				Track temp = tracks[i];
				tracks[i] = tracks[i+1];
				tracks[i+1] = temp;
			}
		}
	}

	//*A method to delete a track*/
	public String deleteTrack(String trackName){
		String del = null;
		if(tracks != null){
			int i = 0;
			for(; i < noOfTracks && !tracks[i].trackName.equals(trackName); i++);
			if(i < noOfTracks){
				del = tracks[i].trackName;
				tracks[i] = null;
			}

		}
		return del;
	}


}

