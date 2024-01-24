package Assignment1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import Assignment1.*;

public class MovieManager {
	ArrayList<Movie> movie = new ArrayList();
	ArrayList<Actor> actor = new ArrayList();
	
	void addMovie(Movie m)
	{
		movie.add(m);
	}
	void addActor(Actor a)
	{
		actor.add(a);
	}
	void removeMovie(int id)
	{
		for(Movie m1 : movie)
		{
			if(m1.getMovieId()==id)
				movie.remove(m1);
		}
		
	}
	void removeActor(int id)
	{
		for(Actor a1 : actor)
		{
			if(a1.getActorId()==id)
				movie.remove(a1);
		}
	}
	void display()
	{
		System.out.println(movie);
		System.out.println(actor);
	}
	
	void addMovieFilmography(Movie m)
	{
		
	}
	public static void main(String[] args)
	{
		Movie m1 = new Movie(1,"Shole","1/9/1990","Drama");
		Movie m2 = new Movie(2,"Bhoot","2/9/2020","Horror");
		Movie m3 = new Movie(3,"Raaz","3/8/2006","Suspense");
		Movie m4 = new Movie(4,"Fukrey","4/12/2012","Comedy");
		
		Actor a1 = new Actor(1,"Ranber","1/9/1984","Indian");
		Actor a2 = new Actor(2,"Max","1/9/1888","American");
		Actor a3 = new Actor(3,"Elizabeth","5/5/1975","Engand");
		Actor a4 = new Actor(4,"Vamski","5/4/1978","Europe");
		
		MovieManager mv = new MovieManager();
		mv.addMovie(m1);
		mv.addMovie(m2);
		mv.addMovie(m3);
		mv.addMovie(m4);
		
		mv.addActor(a1);
		mv.addActor(a2);
		mv.addActor(a3);
		mv.addActor(a4);
		mv.display();
		mv.removeActor(2);
		mv.removeMovie(3);
		mv.display();
		
		HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
		ArrayList<Integer> movieId1 = new ArrayList<>();
		movieId1.add(1);
		movieId1.add(2);
		
		ArrayList<Integer> movieId2 = new ArrayList<>();
		movieId2.add(3);
		movieId2.add(4);
		
		map.put(a1.getActorId(), movieId1);
		map.put(a2.getActorId(), movieId2);
		System.out.println("==========");
		for (HashMap.Entry<Integer, ArrayList<Integer>> e : map.entrySet()) 
		{
			  
            System.out.println(e.getKey() + " : "
                               + e.getValue()); 
		}
		
	}
}
