public class SystemSetting {
    private static SystemSetting systemSetting;
    private double discount;
    private double taxe;
    private double moneda; //puede que no sea double

    private SystemSetting(){
    }

    public static SystemSetting getInstance(){
        if(systemSetting==null){
            systemSetting=new SystemSetting();
            return systemSetting;
        }else{
            return systemSetting;
        }
        
    }
}
