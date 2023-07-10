package Questions.Practice;

import java.util.List;

public class SGPools {

// input string = "123-456-789-0", remainingCharacter = 5, replaceCharacter = '*', ignoreCharacter = '-'
// ***-**6-789-0

    public String hideString(
            String input, int remainingCharacter, char replaceCharacter, char ignoreCharacter) {
        int remaining = remainingCharacter;
        StringBuilder result = new StringBuilder();


        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ignoreCharacter && remaining != 0) {
                result.append(replaceCharacter);
                remaining--;
            } else {
                result.append(input.charAt(i));
            }
        }
        return result.toString();
    }


    /**
     * Input: MainBet: {
     * Result:{
     * TeamA: 2,
     * TeamB: 3,
     * },
     * Bets:[
     * BetMade{
     * TotalWinningGoal: 3,
     * BetLists = [
     * BetId:1
     * Description:"MoreThanTotalWinningGoal"
     * ],
     * [
     * BetId:2
     * Description:"LessThanTotalWinningGoal"
     * ],
     * },
     * ]
     * }
     * 3 parts:
     * 1) TeamA: 2, TeamB: 3 totalGoalWinning: 3
     * {BetId: 1, Status: Win},{BetId: 2, Status: Lose}
     * 2) TeamA: 2, TeamB 3
     * {BetId: 3, Status: Win},{BetId: 4, Status: Lose}, {BetId: 5, Status: Draw}
     **/

    //Assuming that this is an Object
    public List<Object> setBetStatuses(Object object) {
        int totalGoal = object.getteamAScore() + object.getTeamBScore();
        List<Bet> betList = object.getBets();
        for(Bet bet: betList) {
            int TotalWinningGoal = betMade.getTotalWinningGoal();
            for (IndividualBet indiBet : Bet.getBetList) {
            if (bet.getDescription == "MoreThanTotalWinningGoal") {
                if (totalWinningGoal > totalGoal) {
                    indiBet.setStatus("win");
                }
                else
                    indiBet.setStatus("lose");
            }
            if (bet.getDescription == "lessThanTotalLosingGoal") {
                if (totalWinningGoal < totalGoal) {
                    indibet.setStatus("win");
                }
                else
                    indibet.setStatus("lose");
            }
            }
        }
        return betList;
}
}
