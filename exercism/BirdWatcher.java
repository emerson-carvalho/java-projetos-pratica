class BirdWatcher {

    private final int[] birdsPerDay;
    private final int[] birdsLastWeek = {0, 2, 5, 3, 7, 8, 4};
    
	public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }
    
	public int[] getLastWeek() {
        return this.birdsLastWeek;
    }
    
	public int getToday() {
        if (birdsPerDay.length > 0) {
            return birdsPerDay[birdsPerDay.length - 1];
        } else {
            return birdsPerDay.length;
        }
    }
    
	public void incrementTodaysCount() {
        int incremento = getToday() + 1;
        birdsPerDay[birdsPerDay.length - 1] = incremento;
    }
    
	public boolean hasDayWithoutBirds() {
        for (int quantidade : birdsPerDay) {
            if (quantidade == 0) {
                return true;
            }
        }
        return false;
    }
    
	public int getCountForFirstDays(int numberOfDays) {
        int quantidade = birdsPerDay[0];
        
        if (numberOfDays < birdsPerDay.length) {
            for (int i = 1; i < numberOfDays; i++) {
                quantidade = quantidade + birdsPerDay[i];
            }
        } else {
            for (int i = 1; i < birdsPerDay.length; i++) {
                quantidade = quantidade + birdsPerDay[i];
            }
        }
        return quantidade;
    }
    
	public int getBusyDays() {
        int diasOcupados = 0;
        
        for (int quantidade : birdsPerDay) {
            if (quantidade >= 5) {
                diasOcupados++;
            }
        }
        return diasOcupados;    
    }
}