public class CarsAssemble {
    
	public double productionRatePerHour(int speed) {
    
		double txsucesso = 0;
        
		if (speed <= 0 || speed > 10){
            return 0.0;
        } else {
            switch(speed){
                case 1,2,3,4 -> txsucesso = 1; 
                case 5,6,7,8 -> txsucesso = 0.9; 
                case 9 -> txsucesso = 0.8;
                case 10 -> txsucesso = 0.77;
            }
        return (speed * 221) * txsucesso;
        }
    }
    
	public int workingItemsPerMinute(int speed) {
        return (int)productionRatePerHour(speed)/60;
    }
}