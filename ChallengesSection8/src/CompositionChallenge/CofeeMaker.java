package CompositionChallenge;

 class CofeeMaker  {
 private boolean hasWorktoDo;
    public void setHasWorktoDo(boolean hasWorktoDo) {
        this.hasWorktoDo = hasWorktoDo;
    }
    public void brewCoffee(){
        if (hasWorktoDo) {
            System.out.println("Coffee breewing");
            hasWorktoDo=false;
        }
    }
}
