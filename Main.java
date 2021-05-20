public class Main{
	public static void main(String[] args){

		//First album
		MusicAlbum myAlbums = new MusicAlbum("House", "Njabulo"); //Creating the object of album1
		myAlbums.insert("Over the Horizon", 5);
		myAlbums.insert("Under the Stars", 6);
		myAlbums.insert("Hangout", 4);
		myAlbums.insert("Fly away", 7);
		myAlbums.insert("I'm going home", 4);
		myAlbums.print();
		System.out.println("Tracks After sort by a-z");
		myAlbums.sortTracksAlphabetically();
		myAlbums.print();
		System.out.println("Deleting a track from the album");
		String del = myAlbums.deleteTrack("Fly away");
		if(del == null)
			System.out.println("ERROR! track not found! ");
		else
			System.out.println(del + " removed successfully...");
	}
}