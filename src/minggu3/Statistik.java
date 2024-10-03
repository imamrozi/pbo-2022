package minggu3;

public class Statistik {
    int[] dataArr = {20,50,3,4,1,23,16,45,32,22};
    
    void tampilData(){
        System.out.print("Data: ");
        for (int i = 0; i < dataArr.length; i++) {
            if (i==dataArr.length-1) {
                System.out.println(dataArr[i]);
            } else{
                System.out.print(dataArr[i] + ", ");
            }
        }
    }
    int sum(){
        int temp = 0;
        for(int num : dataArr){
            temp += num;
        }
        return temp; 
    }
    
    float avarange(int tot, int length){
        return tot / length;
    }
    
    float avg(){
        return sum()/dataArr.length;
    }
    
    int max(){
        int max = dataArr[0];
        
        for(int i = 1; i < dataArr.length; i++){
            if(max < dataArr[i]){
                max = dataArr[i];
            }
        }
        return max;
    }
    public void sort(){
        //bubble sort
        for(int i=0;i<dataArr.length;i++){
            for(int j=0;j<=i;j++){
                if(dataArr[j]>dataArr[i]){
                    int tmp = dataArr[i];
                    dataArr[i] = dataArr[j];
                    dataArr[j] = tmp;
                }
            }
        }
    }
    
    public float median(){
        sort();
        float med = 0;
        int tengah = dataArr.length/2;
        if(dataArr.length%2==0){//banyak data genap
            med = (dataArr[tengah]+dataArr[tengah-1])/2;
        }else{
            med = dataArr[tengah];
        }
        
        return med;
    }
    
    public static void main(String[] args) {
        Statistik st = new Statistik();
        st.tampilData();
        System.out.println(st.sum());
        System.out.println(st.avarange(st.sum(), st.dataArr.length));
        System.out.println(st.max());
        st.sort();
        st.tampilData();
        System.out.println("Median= "+st.median());
    }
}
