package file;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*统计文件夹大小
*
* 要求:统计文件夹中每种文件个数并打印
* 格式如:
* txt:3个
* doc:2个
*
* */
public class practice05 {
    public static void main(String[] args){
        File f1=new File("D:\\java_code\\a2");
        //System.out.println(countFile(f1)+"字节");
        HashMap<String,Integer> map = countFileNum(f1);
        System.out.println(map);
        /*Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey()+":"+entry.getValue()+"个");
        }*/

    }

//先统计文件夹内存大小
   /* public static long countFile(File src){
        File []files = src.listFiles();
        long size = 0;
        if(files!=null){
            for (File file : files) {
                if(file.isFile()){
                    size=size+file.length();
                }
                size=size+countFile(file);
            }
        }


        return size;
    }*/


    
    //统计文件夹中每种文件个数并打印
    public static HashMap<String,Integer>  countFileNum(File src){
        //进入文件夹
        File[] files=src.listFiles();
        //定义集合用来统计每种文件个数
        HashMap<String,Integer> map =new HashMap<>();

        for (File file : files) {
            if(file.isFile()){
                //如果是文件
                String name = file.getName();
                String[] arr = name.split("\\.");
                if(arr.length>=2){
                    String endName = arr[arr.length-1];
                    if(map.containsKey(endName)){
                        //文件后缀存在
                        map.put(endName,map.get(endName)+1);

                    }else{
                        //文件后缀不存在
                        map.put(endName,1);

                    }
                }
            }else{
                //如果是文件夹,就进行递归
                HashMap<String,Integer> sonMap = countFileNum(file);//sonMap为子文件
                Set<Map.Entry<String, Integer>> entries = sonMap.entrySet();//获取子文件的集合
                for (Map.Entry<String, Integer> entry : entries) {

                    String key = entry.getKey();//获取文件后缀
                    Integer value = entry.getValue();//获取文件个数
                    if(map.containsKey(key)){
                        int count = map.get(key);
                        count = count + value;
                        map.put(key, count);
                    }else{
                        map.put(key, value);
                    }

                }




            }

        }
        return map;



    }

}
