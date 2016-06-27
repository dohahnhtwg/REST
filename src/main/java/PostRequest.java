
public class PostRequest {
    private String game;
    private String player;
    private String score;

    public PostRequest(String game, String player, String score) {
        this.game = game;
        this.player = player;
        this.score = score;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
