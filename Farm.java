class Farm 
{     
   private Animal[] BunchOfAnimals;
   public Farm()
   {
      BunchOfAnimals = new Animal[3];
      BunchOfAnimals[0] = new NamedCow("cow","Vladimir the Third of the Holy Russian Empire","moo");
      BunchOfAnimals[1] = new Chick("chick","cheep","cluck");
      BunchOfAnimals[2] = new Pig("pig","oink");
   }
   public void animalSounds()
   {
      for (int nI=0; nI < BunchOfAnimals.length; nI++)
      {
         System.out.println("The " + BunchOfAnimals[nI].getType() + " goes " + BunchOfAnimals[nI].getSound()); 
      }
      System.out.println("The cow is known as " + ((NamedCow)BunchOfAnimals[0]).getName());
   }
}
