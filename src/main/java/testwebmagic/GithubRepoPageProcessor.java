package testwebmagic;


import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Html;

import java.util.List;

/**
 * @Description
 * @Author wzz
 * @Date 2019/8/2 11:09
 */
public class GithubRepoPageProcessor implements PageProcessor {

    private Site site = Site.me().setRetryTimes(3).setSleepTime(100).setCharset("UTF-8");

    public Site getSite() {
        return site;
    }

    public void process(Page page) {
//        List<String> list = page.getHtml().xpath("//article[@class='txt-detail']/p/outerHtml()").all();
////        list.stream().forEach(e-> System.out.println(e));
//        page.putField("content", list);
        Html html = page.getHtml();
        System.out.println(html);
    }

    public static void main(String[] args) {
//       Spider.create(new GithubRepoPageProcessor()).addUrl("https://www.smzdm.com/p/15294820/#hfeeds").addPipeline(new MyPipe()) .run();
        Spider spider = Spider.create(new GithubRepoPageProcessor());
        spider.thread(1);
//        spider.setEmptySleepTime(3);
        ResultItems resultItems = spider.get("http://www.iciba.com/hello");
//        System.out.println(resultItems.get("content").toString());

    }
}