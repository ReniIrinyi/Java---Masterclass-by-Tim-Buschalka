package CompositionChallenge;

 class Refrigerator  {
    private boolean hasWorktoDo;
    public void setHasWorktoDo(boolean hasWorktoDo) {
        this.hasWorktoDo = hasWorktoDo;
    }
    public void orderFood(){
        if (hasWorktoDo){
            System.out.println("order Food");
            hasWorktoDo=false;
        }
    }
}
