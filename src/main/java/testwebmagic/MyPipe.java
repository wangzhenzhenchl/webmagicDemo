package testwebmagic;

import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

/**
 * @Description
 * @Author wzz
 * @Date 2019/8/19 11:12
 */
public class MyPipe implements Pipeline {
    @Override
    public void process(ResultItems resultItems, Task task) {
        System.out.println(resultItems.getAll().get("content"));
    }
}
