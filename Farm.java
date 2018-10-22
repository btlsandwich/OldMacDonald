class Farm 
{     
   private Animal[] BunchOfAnimals;
   public Farm()
   {
      BunchOfAnimals = new Animal[3];
      BunchOfAnimals[0] = new Cow("cow","moo");
      BunchOfAnimals[1] = new Chick("chick","cluck");
      BunchOfAnimals[2] = new Pig("pig","oink");
   }
   public void animalSounds()
   {
      for (int nI=0; nI < BunchOfAnimals.length; nI++)
      {
         System.out.println(BunchOfAnimals[nI].getType() + " goes " + BunchOfAnimals[nI].getSound()); 
      }
   }
}
