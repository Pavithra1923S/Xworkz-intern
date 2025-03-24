class Netflix
{
	static String kannadaMovies[] ={"Kaatera" , "kranti" , "Roberrt" , "Odeya" , "yajamana" , "dasa" , "Sarathi" , "Chingari" , "kariya" , "Chakravarthy"};
	static String hindiSeries[] ={"Chhaava", "Jigra" , "Newton" , "Agni" , "Mrs" , "Maharaj" , "Munjya" , "Gaslight" , "Kill" , "Forensic" };
	static String englishSeries[] = {"Reacher" , "Black Mirror" , "The Recruit" , "Invincible" , "Toxic Town" , "Breaking Bad" , "Friends" , "Dexter" , "Sherlock" , "Stranger Things" , "Games Of Thrones" , "THe Walking Dead" , "Yellow Jackets" , "THe Wheel Of Time"};
	static String koreanSeries[] = {"Newtopia" , "The Truck" , "Love Your Enemy" , "Love Scout" , "LightShop" , "Study Group" , "My Dearest" , "Kingdom" , "Sweet Home" , "Marry my Husband" , "Squid Game" , " sOlo Leveling" , " Avatar" , "Melo Movie" };
	
	public static void main(String args[])
	{
	System.out.println("Main started");
	getkannadaMovies();
	gethindiSeries();
	getenglishSeries();
	getkoreanSeries();
	System.out.println("Main ended");
	}
	
	public static void getkannadaMovies()
	{
		System.out.println(" inside the getkannadaMovies ");
		System.out.println(" The total number of Kanndamovies are :" + kannadaMovies.length);
	    System.out.println(" The total list of movies are :");
		for( String movies : kannadaMovies){
		System.out.println(movies);
		}
		System.out.println("out of getkannadaMovies");
	}
	
	public static void gethindiSeries()
	{
		System.out.println(" inside the gethindiSeries");
		System.out.println(" The total number of hindiSeries are :" + hindiSeries.length);
	    System.out.println(" The total list of movies are :");
		for( String movies : hindiSeries){
		System.out.println(movies);
		}
		System.out.println("out of gethindiSeries");
	}
	
	public static void getenglishSeries()
	{
		System.out.println(" inside the getenglishSeries ");
		System.out.println(" The total number of englishSeries are :" + englishSeries.length);
	    System.out.println(" The total list of movies are :");
		for( String movies : englishSeries){
		System.out.println(movies);
		}
		System.out.println("out of getenglishSeries");
	}
	
	public static void getkoreanSeries()
	{
		System.out.println(" inside the getkoreanSeries ");
		System.out.println(" The total number of koreanSeries are :" + koreanSeries.length);
	    System.out.println(" The total list of movies are :");
		for( String movies : koreanSeries){
		System.out.println(movies);
		}
		System.out.println("out of getkoreanSeries");
	}
	
	
}