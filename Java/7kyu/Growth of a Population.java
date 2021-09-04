class Arge {
    
    public static int nbYear(int p0, double percent, int aug, int p) {
        int years = 0;
        int population = p0;
      
        while(population < p) {
            population = (int)(population + (population * (float)(percent/100)) + aug);
            years++;
        }
      
        return years;
    }
}