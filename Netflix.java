class Netflix
{
	static String kannadaMovies[] ={"Kaatera" , "kranti" , "Roberrt" , "Odeya" , "yajamana" , "dasa" , "Sarathi" , "Chingari" , "kariya" , "Chakravarthy"};
	static String hindiSeries[] ={"Chhaava", "Jigra" , "Newton" , "Agni" , "Mrs" , "Maharaj" , "Munjya" , "Gaslight" , "Kill" , "Forensic" };
	static String englishSeries[] = {"Reacher" , "Black Mirror" , "The Recruit" , "Invincible" , "Toxic Town" , "Breaking Bad" , "Friends" , "Dexter" , "Sherlock" , "Stranger Things" , "Games Of Thrones" , "THe Walking Dead" , "Yellow Jackets" , "THe Wheel Of Time"};
	static String koreanSeries[] = {"Newtopia" , "The Truck" , "Love Your Enemy" , "Love Scout" , "LightShop" , "Study Group" , "My Dearest" , "Kingdom" , "Sweet Home" , "Marry my Husband" , "Squid Game" , " sOlo Leveling" , " Avatar" , "Melo Movie" };
	
	public static void main(String args[])
	{
		System.out.println("Main started");
		System.out.println(" The total number of Kanndamovies are :" + kannadaMovies.length);
	    System.out.println(" The total list of movies are :");
		for( String movies : kannadaMovies){
		System.out.println(movies);
		}
		System.out.println(" The total number of hindiSeries are :" + hindiSeries.length);
	    System.out.println(" The total list of movies are :");
		for( String movies : hindiSeries){
		System.out.println(movies);
		}
		
		System.out.println(" The total number of englishSeries are :" + englishSeries.length);
	    System.out.println(" The total list of movies are :");
		for( String movies : englishSeries){
		System.out.println(movies);
		}
		
		System.out.println(" The total number of koreanSeries are :" + koreanSeries.length);
	    System.out.println(" The total list of movies are :");
		for( String movies : koreanSeries){
		System.out.println(movies);
		}
		

		System.out.println("Main ended");
	}
	
}