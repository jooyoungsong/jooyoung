package day0703;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_14 {

	public static void main(String[] args) {
		//키는 중복을 허용하지 않고, 값은 중복을 허용한다.
		//key와 value를 쌍으로 저장
		Map<String, String> map=new HashMap<String, String>();
		map.put("name", "손석구");
		map.put("age", "23");
		map.put("addr", "제주시 애월읍");
		
		//같은 키값으로 넣으면 먼저 데이터는 없어진다
		map.put("name", "제니");
		
		System.out.println("size: "+map.size());
		System.out.println("**키값을 정확하게 알면 value값 얻을 수 있다***");
		
		System.out.println("이름: "+map.get("name"));
		System.out.println("나이: "+map.get("age"));
		System.out.println("주소: "+map.get("addr"));
		
		System.out.println("**키캆을 먼저 한꺼번에 얻은 후 값을 얻는 방법***");
		
		Set<String> keyset=map.keySet();
		
		System.out.println("**방법1**");
		Iterator<String> keyIter=keyset.iterator();
		while(keyIter.hasNext())
		{
			String key=keyIter.next();
			System.out.println(key+"==>"+map.get(key));
			
		}
		
		System.out.println("**방법2**");
		for(String key:keyset)
		{
			System.out.println(key+"==>"+map.get(key));
			
		}

	}

}