package com.zhang.zs.news.bean;

import java.util.List;

/**
 * Created by zs on 2016/7/10.
 */
public class ShopBean {


    /**
     * totalCount : 28
     * currentPage : 1
     * totalPage : 2
     * pageSize : 20
     * list : [{"id":1,"name":"联想（Lenovo）拯救者14.0英寸游戏本（i7-4720HQ 4G 1T硬盘 GTX960M 2G独显 FHD IPS屏 背光键盘）黑","imgUrl":"http://7mno4h.com2.z0.glb.qiniucdn.com/s_recommend_55c1e8f7N4b99de71.jpg","description":null,"price":5979,"sale":8654},{"id":2,"name":"奥林巴斯（OLYMPUS）E-M10-1442-EZ 微单电电动变焦套机 银色 内置WIFI 翻转触摸屏 EM10复古高雅","imgUrl":"http://7mno4h.com2.z0.glb.qiniucdn.com/s_recommend_rBEhWlMFnG0IAAAAAAIqnbSuyAAAAIxLwJ57aQAAiq1705.jpg","description":null,"price":3799,"sale":3020},{"id":3,"name":"Apple iPad mini 2 ME276CH/A （配备 Retina 显示屏 7.9英寸 16G WLAN 机型 深空灰色）","imgUrl":"http://7mno4h.com2.z0.glb.qiniucdn.com/s_recommend_548574edNc366ff4a.jpg","description":null,"price":1938,"sale":9138},{"id":4,"name":"华为（HUAWEI）P8max 移动联通双4G 双卡双待 星光银）","imgUrl":"http://7mno4h.com2.z0.glb.qiniucdn.com/s_recommend_55ac5bc9N7dc9657c.jpg","description":null,"price":3388,"sale":6631},{"id":5,"name":"联想（Lenovo）7英寸平板电脑 （四核1.3GHz 1G/8G 蓝牙 GPS ） A7-10 (WiFi版 8G存储 黑色) 官方标配","imgUrl":"http://7mno4h.com2.z0.glb.qiniucdn.com/s_recommend_5535f890Ndfd89dff.jpg","description":null,"price":499,"sale":5742},{"id":6,"name":"未来人类（Terrans Force）X599 15.6英寸游戏本（E3-1231V3 8G 1TB GTX970M 6G独显 3K高清屏）黑","imgUrl":"http://7mno4h.com2.z0.glb.qiniucdn.com/s_recommend_55ec08c8Nd34f91bc.jpg","description":null,"price":9999,"sale":8814},{"id":7,"name":"华硕（ASUS）飞行堡垒FX50JX 15.6英寸游戏笔记本电脑（i5-4200H 4G 7200转500G GTX950M 2G独显 全高清）","imgUrl":"http://7mno4h.com2.z0.glb.qiniucdn.com/s_recommend_5604b257Ne3fd1a5e.jpg","description":null,"price":4799,"sale":6844},{"id":8,"name":"得力（deli）33123 至尊金贵系列大型办公家用保管箱 全钢防盗 震动报警 高65CM","imgUrl":"http://7mno4h.com2.z0.glb.qiniucdn.com/s_recommend_5456e410N65ff4160.jpg","description":null,"price":698,"sale":7777},{"id":9,"name":"AMD Athlon X4（速龙四核）860K盒装CPU （Socket FM2+/3.7GHz/4M/95W）","imgUrl":"http://7mno4h.com2.z0.glb.qiniucdn.com/s_recommend_5411486aN1d4ddc5d.jpg","description":null,"price":29,"sale":8355},{"id":10,"name":"金士顿（Kingston）DTM30R 16GB USB3.0 精致炫薄金属U盘","imgUrl":"http://7mno4h.com2.z0.glb.qiniucdn.com/s_recommend_54b78bf0N24c00fc2.jpg","description":null,"price":42.9,"sale":8442},{"id":11,"name":"三星（SAMSUNG）S22B310B 21.5英寸宽屏LED背光液晶显示器","imgUrl":"http://7mno4h.com2.z0.glb.qiniucdn.com/s_recommend_54695388N06e5b769.jpg","description":null,"price":799,"sale":7145},{"id":12,"name":"希捷（seagate）Expansion 新睿翼1TB 2.5英寸 USB3.0 移动硬盘 (STEA1000400)","imgUrl":"http://7mno4h.com2.z0.glb.qiniucdn.com/s_recommend_5519fdd0N02706f5e.jpg","description":null,"price":399,"sale":402},{"id":13,"name":"联想（ThinkCentre）E73S（10EN001ACD） 小机箱台式电脑 （I3-4160T 4GB 500GB 核显 Win7）23.8英寸显示器","imgUrl":"http://7mno4h.com2.z0.glb.qiniucdn.com/s_recommend_55558580Nbb8545f3.jpg","description":null,"price":3599,"sale":571},{"id":14,"name":"新观 LED随身灯充电宝LED灯 LED护眼灯 阅读灯 下单备注颜色 无备注颜色随机发","imgUrl":"http://7mno4h.com2.z0.glb.qiniucdn.com/s_recommend_5563e1d4Ncc22964e.jpg","description":null,"price":1,"sale":1652},{"id":15,"name":"旅行港版转换插头插座 港版充电器转换头 电源三转二","imgUrl":"http://7mno4h.com2.z0.glb.qiniucdn.com/s_recommend_5583931aN31c0a2cf.jpg","description":null,"price":1,"sale":6547},{"id":16,"name":"极米 XGIMI Z4X LED投影仪 无屏电视 微型投影仪 家用","imgUrl":"http://7mno4h.com2.z0.glb.qiniucdn.com/s_recommend_55c1adc2Nf655de47.jpg","description":null,"price":2699,"sale":7778},{"id":17,"name":"惠普（HP）超薄系列 HP14g-ad005TX 14英寸超薄笔记本（i5-5200U 4G 500G 2G独显 DVD刻录 蓝牙 win8.1）银色","imgUrl":"http://7mno4h.com2.z0.glb.qiniucdn.com/s_recommend_55f9280eN31523bd6.jpg","description":null,"price":3299,"sale":9248},{"id":18,"name":"华硕（ASUS）经典系列X554LP 15.6英寸笔记本 （i5-5200U 4G 500G R5-M230 1G独显 蓝牙 Win8.1 黑色）","imgUrl":"http://7mno4h.com2.z0.glb.qiniucdn.com/s_recommend_5604aab9N7a91521b.jpg","description":null,"price":2999,"sale":2906},{"id":19,"name":"海尔（Haier）云悦mini 2W(Win8.1)迷你主机(Intel四核J1900 4G 500G WIFI USB3.0 Win8.1)迷你电脑","imgUrl":"http://7mno4h.com2.z0.glb.qiniucdn.com/s_rmd53edbf09N01b79405.jpg","description":null,"price":1699,"sale":6786},{"id":20,"name":"橙派（CPAD）E3 1231 V3/8G/GTX960-4G/游戏电脑主机/DIY组装机","imgUrl":"http://7mno4h.com2.z0.glb.qiniucdn.com/s_rmd55619f15Nf1e9c48f.jpg","description":null,"price":3479,"sale":5211}]
     */

    private int totalCount;
    private int currentPage;
    private int totalPage;
    private int pageSize;
    /**
     * id : 1
     * name : 联想（Lenovo）拯救者14.0英寸游戏本（i7-4720HQ 4G 1T硬盘 GTX960M 2G独显 FHD IPS屏 背光键盘）黑
     * imgUrl : http://7mno4h.com2.z0.glb.qiniucdn.com/s_recommend_55c1e8f7N4b99de71.jpg
     * description : null
     * price : 5979
     * sale : 8654
     */

    private List<ListBean> list;

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        private int id;
        private String name;
        private String imgUrl;
        private String description;
        private float price;
        private int sale;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getImgUrl() {
            return imgUrl;
        }

        public void setImgUrl(String imgUrl) {
            this.imgUrl = imgUrl;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        public int getSale() {
            return sale;
        }

        public void setSale(int sale) {
            this.sale = sale;
        }
    }
}
