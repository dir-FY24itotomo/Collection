package sample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSample {

	public static void main(String[] args) {
		List<String> places = new ArrayList<>();

        // add()
        places.add("アイスランド");
        places.add("スペイン");
        places.add("ナポリ");
        places.add("リスボン");
        places.add("ヨセミテ国立公園");

        // forEach
        System.out.println("■Stream forEachによる取得：");
        places.stream().forEach(place -> System.out.println(place));

        // filter
        System.out.println("■「ン」で終わる場所のみ抽出：");
        places.stream()
              .filter(place -> place.endsWith("ン"))
              .forEach(place -> System.out.println(place));

        // map
        System.out.println("■各場所名の長さを表示：");
        places.stream()
              .map(place -> place + " の長さ: " + place.length())
              .forEach(place -> System.out.println(place));

        // sorted
        System.out.println("■ソート：");
        places.stream()
              .sorted()
              .forEach(place -> System.out.println(place));

        // collect
        List<String> filteredPlaces = places.stream()
                .filter(place -> place.contains("ス"))
                .collect(Collectors.toList());
        System.out.println("「ス」を含む場所：" + filteredPlaces);	
		
	}

}
