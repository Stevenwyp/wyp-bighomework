package com.example.finalhomework.bean;

import com.example.finalhomework.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc1; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号
    public int pic_id;
    public String title;
    public boolean bPressed;
    public int id;
    private static int seq = 0;
    public String desc;
    public GoodsInfo(int pic_id, String title, String desc) {
        rowid = 0L;
        sn = 0;
        name = "";
        desc1 = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
        this.pic_id = pic_id;
        this.title = title;
        this.desc = desc;
        this.bPressed = false;
        this.id = this.seq;
        this.seq++;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "风景1", "风景2", "风景3", "风景4", "风景5", "风景6","风景7","风景8","风景9", "风景10", "风景11", "风景12", "风景13"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "风景1：玉屏楼图片黄山玉屏景区以玉屏楼为中心，莲花峰和天都峰为主体，通常人们所说的前山，就是指的这一景区。沿途有“蓬莱三岛”、“百步云梯”、“一线天”、“新一线天”、“鳌鱼洞”等景观",
            "风景2：玉屏楼地处天都、莲花之间，这里几乎集黄山奇景之大成，故有黄山绝佳处之称，驰名中外的迎客松挺立在玉屏楼左侧",
            "风景3：右侧有送客松，楼前有陪客松、文殊台，楼后是玉屏峰，著名的“玉屏卧佛“就在峰顶，头左脚右，惟妙惟肖。",
            "风景4：天都峰位于玉屏峰南，相距一公里，是黄山三大主峰中最为险峻之处，海拔1830米。上天都的路极为险峻，但经过建设者们的不断开拓，使登峰道路有惊无险。天都峰顶有“登峰造极”石刻，",
            "风景5：使人有“海到尽处天是岸，山登绝顶我为峰”之感。",
            "风景6：莲花峰，位于玉屏楼北，是黄山第一高峰，海拔1864.8米，峻峭高耸，气势雄伟，宛如初绽的莲花，故名。",
            "风景7：从莲花岭至莲花峰顶约1.5公里，这段路叫莲花梗，沿途有飞龙松、倒挂松等黄山名松及黄山杜鹃。莲花峰绝顶处方圆丈余，中间有香砂井，在万里晴空时，可东望天目山，西望庐山，北望九华山。",
            "风景8：雨后，纵观八面云海，更为壮观。 ",
            "风景9：黄山北海景区是黄山景区的腹地，在光明顶与始信峰、狮子峰、白鹅峰之间，东连云谷景区，南接玉屏景区，北近松谷景区。",
            "风景10：是一片海拔1600米左右的高山开阔地带，面积1316公顷。",
            "风景11：北海景区以峰为体，汇集了峰、石、矼、坞、台和松、云奇景，以伟、奇、险、幻为特色，天工的奇妙布局，琉璃色彩变幻，构成一幅幅伟、奇、幻、险的天然画卷，是黄山的风景窗。",
            "风景12：北海群峰荟萃，石门峰、贡阳山，都属海拔1800米以上的高峰，形如屏障，隔开南北。",
            "风景13： 海拔1690米的狮子峰却头东尾西的横卧在景区之中，狮子峰上的清凉台是观赏云海和日出的最佳之处。"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {433, 2252, 5653, 1189, 8451, 1454,1515,4045,4644,2424,5345,4453,5345};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.ma, R.drawable.lh, R.drawable.yu,
            R.drawable.wg, R.drawable.xz, R.drawable.qw, R.drawable.qe, R.drawable.nu, R.drawable.ls, R.drawable.
            xm,R.drawable.mt,R.drawable.go,R.drawable.hl
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.ma, R.drawable.lh, R.drawable.yu,
            R.drawable.wg, R.drawable.xz, R.drawable.qw, R.drawable.qe, R.drawable.nu, R.drawable.ls, R.drawable.
            xm,R.drawable.mt,R.drawable.go,R.drawable.hl
    };

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc1 = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
    private static int[] gridImageArray = {R.drawable.pic_01, R.drawable.pic_02, R.drawable.pic_03
            , R.drawable.pic_04, R.drawable.pic_05, R.drawable.pic_06, R.drawable.pic_07
            , R.drawable.pic_08, R.drawable.pic_09, R.drawable.pic_10};
    private static String[] gridTitleArray = { "风景1", "风景2", "风景3", "风景4", "风景5", "风景6","风景7","风景8","风景9", "风景10"};

    public static ArrayList<GoodsInfo> getDefaultGrid() {
        ArrayList<GoodsInfo> gridArray = new ArrayList<GoodsInfo>();
        for (int i = 0; i < gridImageArray.length; i++) {
            gridArray.add(new GoodsInfo(gridImageArray[i], gridTitleArray[i], null));
        }
        return gridArray;
    }
    private static int[] stagImageArray = {R.drawable.skirt01, R.drawable.skirt02, R.drawable.skirt03
            , R.drawable.skirt04, R.drawable.skirt01, R.drawable.skirt02, R.drawable.skirt03
            , R.drawable.skirt04, R.drawable.skirt01, R.drawable.skirt02, R.drawable.skirt03
            , R.drawable.skirt04, R.drawable.skirt01
};
    private static String[] stagTitleArray = {"11", "22", "33", "44", "55", "66",
            "77", "88", "99", "1010", "1111", "1212", "1313" };

    public static ArrayList<GoodsInfo> getDefaultStag() {

        ArrayList<GoodsInfo> stagArray = new ArrayList<GoodsInfo>();
        for (int i = 0; i < stagImageArray.length; i++) {
            stagArray.add(new GoodsInfo(stagImageArray[i], stagTitleArray[i], null));
        }
        return stagArray;
    }
}
