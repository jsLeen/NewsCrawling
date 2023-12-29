//import java.io.IOException;
//
//import org.jsoup.Connection;
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;
//
//public class Crawling {
//    public static void main(String[] args) {
//        try {
//            String URL = "https://news.naver.com/main/main.naver?mode=LSD&mid=shm&sid1=105";
//            Connection conn = Jsoup.connect(URL);
//
//            Document document = conn.get();
//
//            Elements parsingDivs = document.getElementsByClass("section_body"); // class가 parsingDiv인 element 찾기
//            Element parsingDiv = parsingDivs.get(0);
//
//            Elements titleElements = document.select("div.section_body > dt");
//            for (int j = 1; j < titleElements.size(); j+=2) {
//                final String title = titleElements.get(j).text();
//                System.out.println("강의 제목: " + title);
//            }
//
////            Element parsingTitle = parsingDiv.getElementById("parsingTitle"); // id가 parsingTitle인 element 찾기
////            Element partsingContents = parsingDiv.getElementById("partsingContents"); // id가 parsingContents인 element 찾기
////
////            String title = parsingTitle.getElementsByTag("h3").get(0).text(); // 첫 번째 h3태그의 text값 찾기
////            String contents = partsingContents.getElementsByTag("p").get(0).text(); // 첫 번째 p태그의 text값 찾기
////
////            System.out.println("파싱한 제목: " + title);
////            System.out.println("파싱한 내용: " + contents);
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//    }
//}

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Crawling {

    public static void main(String[] args) {
        final String url = "https://news.sbs.co.kr/news/newsflash.do";
        Connection conn = Jsoup.connect(url);

        try {
            Document document = conn.get();
            Elements headlines = document.getElementsByClass("sub");

            for (Element headline : headlines) {
                System.out.println("뉴스 제목 : " + headline.text());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}