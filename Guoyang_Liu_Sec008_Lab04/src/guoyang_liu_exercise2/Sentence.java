package guoyang_liu_exercise2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;

public class Sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "good good study, day day up.";
		System.out.println(str);
        Queue<String> queue = toQueue(str);//toQueue()

        /*
         * loop queue, put into map
         */
        Map<String,Integer> map = new LinkedHashMap<String,Integer>();//LinkedHashMap
        //Map<String,Integer> map = new HashMap<String,Integer>();//HashMap
        while(queue.size()>0){
            String key = queue.poll();
            if(!map.containsKey(key)){//if not key,put key,++
                map.put(key, 1);
            }else{
                map.put(key, map.get(key)+1);//if key,value++
            }
        }

        /*
         * loop key
         */
        Set<String> keySet = map.keySet();
        for(String setWord:keySet){//for loop
            String word = setWord;
            System.out.println(word+" duplicates number:"+map.get(word));
        }

      


    }
  
    public static Queue<String> toQueue(String str){
        String regex = "\\,|\\.";
        str = str.replaceAll(regex, " ");
        

        String regex2 = "\\ +";
        str = str.replaceAll(regex2, " ");
        

        String[] words = str.split(" ");
        

        //queue
        Queue<String> queue = new LinkedList<String>();
        for(String word : words){
            queue.offer(word);
        }
        return queue;
    }
        
	}


