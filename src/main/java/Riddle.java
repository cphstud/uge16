public class Riddle {
    int level;
    String solution;
    String name;
    boolean isSolved;
    String message;

    public Riddle(int level, String name)  {
        this.level=level;
        this.name=name;
        this.isSolved=false;
    }

    public void setMessage(String msg) {
        this.message = msg;
    }
    public void setSolution(String msg) {
        this.solution = msg;
    }
    public boolean solveRiddle(String userGuess) throws AlreadySolvedException {
        boolean isSolved = false;
        if (!this.isSolved) {
            if (this.solution.equals(userGuess)) {
                isSolved = true;
                this.isSolved = true;
                return isSolved;
            } else {
                return isSolved;
            }
        } else throw new AlreadySolvedException("Riddle "+this.name + " has been solved");
    }
}
