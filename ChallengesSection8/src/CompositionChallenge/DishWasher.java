package CompositionChallenge;

 class DishWasher {
    private boolean hasWorktoDo;
    public void setHasWorktoDo(boolean hasWorktoDo) {
        this.hasWorktoDo = hasWorktoDo;
    }
    public void doDishes(){
        if (hasWorktoDo) {
            System.out.println("Do dishes");
            hasWorktoDo=false;
        }
    }
}
