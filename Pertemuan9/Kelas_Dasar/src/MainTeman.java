public class MainTeman {
    
    public static void main(String[] args) {
        
        Teman T1 = new Teman();
    
        T1.addNama("Sherina");
        T1.addNama("Izzati");
        T1.addNama("Fitria");
        T1.showTeman();
        System.out.println("Jumlah teman :  " + T1.getNbelm());
        System.out.println("isMember ? Fitria : " + T1.isMember("Fitria"));

        
        System.out.println();
        System.out.println("==============GANTI NAMA============");
        System.out.println();
        
        T1.gantiNama("Fitria", "Haikal");
        T1.showTeman();
        System.out.println("isMember ? Fitria :  " + T1.isMember("Fitria"));
        System.out.println();
        System.out.println("Jumlah Haikal :  " + T1.countNama("Haikal"));


        System.out.println();
        System.out.println("==============DELETE NAMA============");
        System.out.println();
        T1.delNama("Haikal");
        T1.showTeman();
        System.out.println("isMember ? Haikal :  " + T1.isMember("Haikal"));
        System.out.println("Jumlah Haikal :  " + T1.countNama("Haikal"));

        System.out.println();
        System.out.println("Teman ke-2 : " + T1.getNama(2) );


        System.out.println();
        System.out.println("==============SET NAMA============");
        System.out.println();
        T1.setNama(2,"Carmen");
        T1.showTeman();
  


        

        
    }
}
