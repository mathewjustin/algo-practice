package per.algo.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Tournament {

    Map<String,Integer> teamScore=new HashMap<>();
    Integer AWAY_WON=0;
    public String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        String currentBest="";
        Integer currentBestScore=0;
        for(int i=0;i<competitions.size();i++)
        {
            Integer result=results.get(i);
            String currentWon;
            if(result==AWAY_WON)
            {
                currentWon=competitions.get(i).get(1);
            }
            else{
                currentWon=competitions.get(i).get(0);
            }
            updateScore(currentWon,3);
            if(teamScore.get(currentWon)>currentBestScore)
            {
                currentBestScore=teamScore.get(currentWon);
                currentBest=currentWon;
            }


        }
        return currentBest;
    }
    private void updateScore(String team,Integer score)
    {
        if(teamScore.get(team)==null)
        {
            //add
            teamScore.put(team,score);
        }else{
            //update
            teamScore.put(team,teamScore.get(team)+score);
        }
    }
}
