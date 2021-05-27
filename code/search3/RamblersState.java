/*
*	State in a map search
*	Phil Green 2013 version
* Heidi Christensen (heidi.christensen@sheffield.ac.uk) 2021 version
*/

import java.util.*;

public class RamblersState extends SearchState {

  private Coords coords;
  private int x;
  private int y;


  // constructor
  public RamblersState(int lc, Coords coords) {
    localCost = lc;
    this.coords = coords;

  }


  // goalPredicate
  public boolean goalPredicate(Search searcher) {
    RamblersSearch msearcher = (RamblersSearch) searcher;
    String tar = msearcher.getGoal(); // get target city
    return ();
  }

  // getSuccessors
  public ArrayList<SearchState> getSuccessors(Search searcher) {
    RamblersSearch msearcher = (RamblersSearch) searcher;
    TerrainMap map = msearcher.getMap();
    ArrayList<RamblersState> list =  new ArrayList<RamblersState>();
      list.add(new RamblersState(0, new Coords(0, 0));


    ArrayList<SearchState> succs = new ArrayList<SearchState>();


      succs.add((SearchState) new RamblersState(l.getCost()));

  }

  // sameState

  public boolean sameState(SearchState s2) {
    RamblersState ms2 = (RamblersState) s2;

  }

  // toString
  public String toString() {
    return (");
  }

}
