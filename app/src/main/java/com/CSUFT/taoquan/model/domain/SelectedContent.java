package com.CSUFT.taoquan.model.domain;

import java.util.List;

public class SelectedContent {


    /**
     * success : true
     * code : 10000
     * message : 获取精选内容成功.
     * data : {"tbk_dg_optimus_material_response":{"is_default":"false","result_list":{"map_data":[{"category_id":50008144,"click_url":"//s.click.taobao.com/t?e=m%3D2%26s%3DlJgAEyhCrO5w4vFB6t2Z2ueEDrYVVa64Dne87AjQPk9yINtkUhsv0BGqd58JmILAYzajr9m7HbFm5nS0VR3oT0KAZCke%2BMGJxC%2FP4%2FZfPFbcQmwDRwHnn1oN8CPq4PKMZiqtwk9j5QNwvQ4T0RclA0piZyojCAil3bk9c5uYdcJJ2sZNeXWPpYaKC%2FeSWU%2BESdChf3U3iXY%2B5QowgvHJPA%3D%3D&union_lens=lensId%3AMAPI%401606868085%400b084067_61bf_17620cd2ca7_0966%4001","commission_rate":"6.0","coupon_amount":300,"coupon_click_url":"//uland.taobao.com/coupon/edetail?e=BQ1BrJwFL%2BkNfLV8niU3R5TgU2jJNKOfNNtsjZw%2F%2FoJ1jDoro1wdMBOqbXOIWCrKVDwQX%2BS9752cJ7tD75HQ3cuRTiT9oEhVZV8pr6FWc0Mh3vuixAH1Zob8dOHZaKvnmMHpNfYdHdBwWfUaU7r%2BdMHdg8oYVc%2FsB3IEI%2FtGZdTSBjM3vXy9T041UyeSsrqpDNJ7jXMyFwklM1ZJHcLCJg%3D%3D&&app_pvid=59590_11.8.64.103_860_1606868085757&ptl=floorId:31539;app_pvid:59590_11.8.64.103_860_1606868085757;tpp_pvid:&union_lens=lensId%3AMAPI%401606868085%400b084067_61bf_17620cd2ca7_0966%4001","coupon_end_time":"1607270399000","coupon_info":"满360元减300元","coupon_remain_count":29872,"coupon_share_url":"//uland.taobao.com/coupon/edetail?e=BQ1BrJwFL%2BkNfLV8niU3R5TgU2jJNKOfNNtsjZw%2F%2FoJ1jDoro1wdMBOqbXOIWCrKVDwQX%2BS9752cJ7tD75HQ3cuRTiT9oEhVZV8pr6FWc0Mh3vuixAH1Zob8dOHZaKvnmMHpNfYdHdBwWfUaU7r%2BdMHdg8oYVc%2FsB3IEI%2FtGZdTSBjM3vXy9T041UyeSsrqpDNJ7jXMyFwklM1ZJHcLCJg%3D%3D&&app_pvid=59590_11.8.64.103_860_1606868085757&ptl=floorId:31539;app_pvid:59590_11.8.64.103_860_1606868085757;tpp_pvid:&union_lens=lensId%3AMAPI%401606868085%400b084067_61bf_17620cd2ca7_0966%4001","coupon_start_fee":"360.0","coupon_start_time":"1606665600000","coupon_total_count":30000,"item_id":594075702474,"level_one_category_id":50008141,"nick":"龙瓷酒类旗舰店","pict_url":"//img.alicdn.com/i4/4175125965/O1CN01KNnZu71tw19nskpoZ_!!0-item_pic.jpg","reserve_price":"399","seller_id":4175125965,"shop_title":"龙瓷酒类旗舰店","small_images":{"string":["//img.alicdn.com/i3/4175125965/O1CN01iVowAW1tw19raWEqi_!!4175125965.png","//img.alicdn.com/i3/4175125965/O1CN01NkvSBj1tw19koRTnP_!!4175125965.jpg","//img.alicdn.com/i4/4175125965/O1CN01zjiAjf1tw19p7AzLr_!!4175125965.jpg","//img.alicdn.com/i4/4175125965/O1CN01MSDCir1tw19nsMKfB_!!4175125965.jpg"]},"title":"蓝色典藏52度白酒浓香型整箱特价500ml*6瓶装粮食酒礼盒请客送礼","user_type":1,"volume":594,"white_image":"https://img.alicdn.com/bao/uploaded/O1CN016dhqCm1tw166Yots4_!!2-item_pic.png","zk_final_price":"399"}]},"total_count":102,"request_id":"halxxzla7z9o"}}
     */

    private boolean success;
    private int code;
    private String message;
    private DataBean data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * tbk_dg_optimus_material_response : {"is_default":"false","result_list":{"map_data":[{"category_id":50008144,"click_url":"//s.click.taobao.com/t?e=m%3D2%26s%3DlJgAEyhCrO5w4vFB6t2Z2ueEDrYVVa64Dne87AjQPk9yINtkUhsv0BGqd58JmILAYzajr9m7HbFm5nS0VR3oT0KAZCke%2BMGJxC%2FP4%2FZfPFbcQmwDRwHnn1oN8CPq4PKMZiqtwk9j5QNwvQ4T0RclA0piZyojCAil3bk9c5uYdcJJ2sZNeXWPpYaKC%2FeSWU%2BESdChf3U3iXY%2B5QowgvHJPA%3D%3D&union_lens=lensId%3AMAPI%401606868085%400b084067_61bf_17620cd2ca7_0966%4001","commission_rate":"6.0","coupon_amount":300,"coupon_click_url":"//uland.taobao.com/coupon/edetail?e=BQ1BrJwFL%2BkNfLV8niU3R5TgU2jJNKOfNNtsjZw%2F%2FoJ1jDoro1wdMBOqbXOIWCrKVDwQX%2BS9752cJ7tD75HQ3cuRTiT9oEhVZV8pr6FWc0Mh3vuixAH1Zob8dOHZaKvnmMHpNfYdHdBwWfUaU7r%2BdMHdg8oYVc%2FsB3IEI%2FtGZdTSBjM3vXy9T041UyeSsrqpDNJ7jXMyFwklM1ZJHcLCJg%3D%3D&&app_pvid=59590_11.8.64.103_860_1606868085757&ptl=floorId:31539;app_pvid:59590_11.8.64.103_860_1606868085757;tpp_pvid:&union_lens=lensId%3AMAPI%401606868085%400b084067_61bf_17620cd2ca7_0966%4001","coupon_end_time":"1607270399000","coupon_info":"满360元减300元","coupon_remain_count":29872,"coupon_share_url":"//uland.taobao.com/coupon/edetail?e=BQ1BrJwFL%2BkNfLV8niU3R5TgU2jJNKOfNNtsjZw%2F%2FoJ1jDoro1wdMBOqbXOIWCrKVDwQX%2BS9752cJ7tD75HQ3cuRTiT9oEhVZV8pr6FWc0Mh3vuixAH1Zob8dOHZaKvnmMHpNfYdHdBwWfUaU7r%2BdMHdg8oYVc%2FsB3IEI%2FtGZdTSBjM3vXy9T041UyeSsrqpDNJ7jXMyFwklM1ZJHcLCJg%3D%3D&&app_pvid=59590_11.8.64.103_860_1606868085757&ptl=floorId:31539;app_pvid:59590_11.8.64.103_860_1606868085757;tpp_pvid:&union_lens=lensId%3AMAPI%401606868085%400b084067_61bf_17620cd2ca7_0966%4001","coupon_start_fee":"360.0","coupon_start_time":"1606665600000","coupon_total_count":30000,"item_id":594075702474,"level_one_category_id":50008141,"nick":"龙瓷酒类旗舰店","pict_url":"//img.alicdn.com/i4/4175125965/O1CN01KNnZu71tw19nskpoZ_!!0-item_pic.jpg","reserve_price":"399","seller_id":4175125965,"shop_title":"龙瓷酒类旗舰店","small_images":{"string":["//img.alicdn.com/i3/4175125965/O1CN01iVowAW1tw19raWEqi_!!4175125965.png","//img.alicdn.com/i3/4175125965/O1CN01NkvSBj1tw19koRTnP_!!4175125965.jpg","//img.alicdn.com/i4/4175125965/O1CN01zjiAjf1tw19p7AzLr_!!4175125965.jpg","//img.alicdn.com/i4/4175125965/O1CN01MSDCir1tw19nsMKfB_!!4175125965.jpg"]},"title":"蓝色典藏52度白酒浓香型整箱特价500ml*6瓶装粮食酒礼盒请客送礼","user_type":1,"volume":594,"white_image":"https://img.alicdn.com/bao/uploaded/O1CN016dhqCm1tw166Yots4_!!2-item_pic.png","zk_final_price":"399"}]},"total_count":102,"request_id":"halxxzla7z9o"}
         */

        private TbkDgOptimusMaterialResponseBean tbk_dg_optimus_material_response;

        public TbkDgOptimusMaterialResponseBean getTbk_dg_optimus_material_response() {
            return tbk_dg_optimus_material_response;
        }

        public void setTbk_dg_optimus_material_response(TbkDgOptimusMaterialResponseBean tbk_dg_optimus_material_response) {
            this.tbk_dg_optimus_material_response = tbk_dg_optimus_material_response;
        }

        public static class TbkDgOptimusMaterialResponseBean {
            /**
             * is_default : false
             * result_list : {"map_data":[{"category_id":50008144,"click_url":"//s.click.taobao.com/t?e=m%3D2%26s%3DlJgAEyhCrO5w4vFB6t2Z2ueEDrYVVa64Dne87AjQPk9yINtkUhsv0BGqd58JmILAYzajr9m7HbFm5nS0VR3oT0KAZCke%2BMGJxC%2FP4%2FZfPFbcQmwDRwHnn1oN8CPq4PKMZiqtwk9j5QNwvQ4T0RclA0piZyojCAil3bk9c5uYdcJJ2sZNeXWPpYaKC%2FeSWU%2BESdChf3U3iXY%2B5QowgvHJPA%3D%3D&union_lens=lensId%3AMAPI%401606868085%400b084067_61bf_17620cd2ca7_0966%4001","commission_rate":"6.0","coupon_amount":300,"coupon_click_url":"//uland.taobao.com/coupon/edetail?e=BQ1BrJwFL%2BkNfLV8niU3R5TgU2jJNKOfNNtsjZw%2F%2FoJ1jDoro1wdMBOqbXOIWCrKVDwQX%2BS9752cJ7tD75HQ3cuRTiT9oEhVZV8pr6FWc0Mh3vuixAH1Zob8dOHZaKvnmMHpNfYdHdBwWfUaU7r%2BdMHdg8oYVc%2FsB3IEI%2FtGZdTSBjM3vXy9T041UyeSsrqpDNJ7jXMyFwklM1ZJHcLCJg%3D%3D&&app_pvid=59590_11.8.64.103_860_1606868085757&ptl=floorId:31539;app_pvid:59590_11.8.64.103_860_1606868085757;tpp_pvid:&union_lens=lensId%3AMAPI%401606868085%400b084067_61bf_17620cd2ca7_0966%4001","coupon_end_time":"1607270399000","coupon_info":"满360元减300元","coupon_remain_count":29872,"coupon_share_url":"//uland.taobao.com/coupon/edetail?e=BQ1BrJwFL%2BkNfLV8niU3R5TgU2jJNKOfNNtsjZw%2F%2FoJ1jDoro1wdMBOqbXOIWCrKVDwQX%2BS9752cJ7tD75HQ3cuRTiT9oEhVZV8pr6FWc0Mh3vuixAH1Zob8dOHZaKvnmMHpNfYdHdBwWfUaU7r%2BdMHdg8oYVc%2FsB3IEI%2FtGZdTSBjM3vXy9T041UyeSsrqpDNJ7jXMyFwklM1ZJHcLCJg%3D%3D&&app_pvid=59590_11.8.64.103_860_1606868085757&ptl=floorId:31539;app_pvid:59590_11.8.64.103_860_1606868085757;tpp_pvid:&union_lens=lensId%3AMAPI%401606868085%400b084067_61bf_17620cd2ca7_0966%4001","coupon_start_fee":"360.0","coupon_start_time":"1606665600000","coupon_total_count":30000,"item_id":594075702474,"level_one_category_id":50008141,"nick":"龙瓷酒类旗舰店","pict_url":"//img.alicdn.com/i4/4175125965/O1CN01KNnZu71tw19nskpoZ_!!0-item_pic.jpg","reserve_price":"399","seller_id":4175125965,"shop_title":"龙瓷酒类旗舰店","small_images":{"string":["//img.alicdn.com/i3/4175125965/O1CN01iVowAW1tw19raWEqi_!!4175125965.png","//img.alicdn.com/i3/4175125965/O1CN01NkvSBj1tw19koRTnP_!!4175125965.jpg","//img.alicdn.com/i4/4175125965/O1CN01zjiAjf1tw19p7AzLr_!!4175125965.jpg","//img.alicdn.com/i4/4175125965/O1CN01MSDCir1tw19nsMKfB_!!4175125965.jpg"]},"title":"蓝色典藏52度白酒浓香型整箱特价500ml*6瓶装粮食酒礼盒请客送礼","user_type":1,"volume":594,"white_image":"https://img.alicdn.com/bao/uploaded/O1CN016dhqCm1tw166Yots4_!!2-item_pic.png","zk_final_price":"399"}]}
             * total_count : 102
             * request_id : halxxzla7z9o
             */

            private String is_default;
            private ResultListBean result_list;
            private int total_count;
            private String request_id;

            public String getIs_default() {
                return is_default;
            }

            public void setIs_default(String is_default) {
                this.is_default = is_default;
            }

            public ResultListBean getResult_list() {
                return result_list;
            }

            public void setResult_list(ResultListBean result_list) {
                this.result_list = result_list;
            }

            public int getTotal_count() {
                return total_count;
            }

            public void setTotal_count(int total_count) {
                this.total_count = total_count;
            }

            public String getRequest_id() {
                return request_id;
            }

            public void setRequest_id(String request_id) {
                this.request_id = request_id;
            }

            public static class ResultListBean {
                private List<MapDataBean> map_data;

                public List<MapDataBean> getMap_data() {
                    return map_data;
                }

                public void setMap_data(List<MapDataBean> map_data) {
                    this.map_data = map_data;
                }

                public static class MapDataBean implements IBaseInfo {
                    /**
                     * category_id : 50008144
                     * click_url : //s.click.taobao.com/t?e=m%3D2%26s%3DlJgAEyhCrO5w4vFB6t2Z2ueEDrYVVa64Dne87AjQPk9yINtkUhsv0BGqd58JmILAYzajr9m7HbFm5nS0VR3oT0KAZCke%2BMGJxC%2FP4%2FZfPFbcQmwDRwHnn1oN8CPq4PKMZiqtwk9j5QNwvQ4T0RclA0piZyojCAil3bk9c5uYdcJJ2sZNeXWPpYaKC%2FeSWU%2BESdChf3U3iXY%2B5QowgvHJPA%3D%3D&union_lens=lensId%3AMAPI%401606868085%400b084067_61bf_17620cd2ca7_0966%4001
                     * commission_rate : 6.0
                     * coupon_amount : 300
                     * coupon_click_url : //uland.taobao.com/coupon/edetail?e=BQ1BrJwFL%2BkNfLV8niU3R5TgU2jJNKOfNNtsjZw%2F%2FoJ1jDoro1wdMBOqbXOIWCrKVDwQX%2BS9752cJ7tD75HQ3cuRTiT9oEhVZV8pr6FWc0Mh3vuixAH1Zob8dOHZaKvnmMHpNfYdHdBwWfUaU7r%2BdMHdg8oYVc%2FsB3IEI%2FtGZdTSBjM3vXy9T041UyeSsrqpDNJ7jXMyFwklM1ZJHcLCJg%3D%3D&&app_pvid=59590_11.8.64.103_860_1606868085757&ptl=floorId:31539;app_pvid:59590_11.8.64.103_860_1606868085757;tpp_pvid:&union_lens=lensId%3AMAPI%401606868085%400b084067_61bf_17620cd2ca7_0966%4001
                     * coupon_end_time : 1607270399000
                     * coupon_info : 满360元减300元
                     * coupon_remain_count : 29872
                     * coupon_share_url : //uland.taobao.com/coupon/edetail?e=BQ1BrJwFL%2BkNfLV8niU3R5TgU2jJNKOfNNtsjZw%2F%2FoJ1jDoro1wdMBOqbXOIWCrKVDwQX%2BS9752cJ7tD75HQ3cuRTiT9oEhVZV8pr6FWc0Mh3vuixAH1Zob8dOHZaKvnmMHpNfYdHdBwWfUaU7r%2BdMHdg8oYVc%2FsB3IEI%2FtGZdTSBjM3vXy9T041UyeSsrqpDNJ7jXMyFwklM1ZJHcLCJg%3D%3D&&app_pvid=59590_11.8.64.103_860_1606868085757&ptl=floorId:31539;app_pvid:59590_11.8.64.103_860_1606868085757;tpp_pvid:&union_lens=lensId%3AMAPI%401606868085%400b084067_61bf_17620cd2ca7_0966%4001
                     * coupon_start_fee : 360.0
                     * coupon_start_time : 1606665600000
                     * coupon_total_count : 30000
                     * item_id : 594075702474
                     * level_one_category_id : 50008141
                     * nick : 龙瓷酒类旗舰店
                     * pict_url : //img.alicdn.com/i4/4175125965/O1CN01KNnZu71tw19nskpoZ_!!0-item_pic.jpg
                     * reserve_price : 399
                     * seller_id : 4175125965
                     * shop_title : 龙瓷酒类旗舰店
                     * small_images : {"string":["//img.alicdn.com/i3/4175125965/O1CN01iVowAW1tw19raWEqi_!!4175125965.png","//img.alicdn.com/i3/4175125965/O1CN01NkvSBj1tw19koRTnP_!!4175125965.jpg","//img.alicdn.com/i4/4175125965/O1CN01zjiAjf1tw19p7AzLr_!!4175125965.jpg","//img.alicdn.com/i4/4175125965/O1CN01MSDCir1tw19nsMKfB_!!4175125965.jpg"]}
                     * title : 蓝色典藏52度白酒浓香型整箱特价500ml*6瓶装粮食酒礼盒请客送礼
                     * user_type : 1
                     * volume : 594
                     * white_image : https://img.alicdn.com/bao/uploaded/O1CN016dhqCm1tw166Yots4_!!2-item_pic.png
                     * zk_final_price : 399
                     */

                    private int category_id;
                    private String click_url;
                    private String commission_rate;
                    private int coupon_amount;
                    private String coupon_click_url;
                    private String coupon_end_time;
                    private String coupon_info;
                    private int coupon_remain_count;
                    private String coupon_share_url;
                    private String coupon_start_fee;
                    private String coupon_start_time;
                    private int coupon_total_count;
                    private long item_id;
                    private int level_one_category_id;
                    private String nick;
                    private String pict_url;
                    private String reserve_price;
                    private long seller_id;
                    private String shop_title;
                    private SmallImagesBean small_images;
                    private String title;
                    private int user_type;
                    private int volume;
                    private String white_image;
                    private String zk_final_price;

                    public int getCategory_id() {
                        return category_id;
                    }

                    public void setCategory_id(int category_id) {
                        this.category_id = category_id;
                    }

                    public String getClick_url() {
                        return click_url;
                    }

                    public void setClick_url(String click_url) {
                        this.click_url = click_url;
                    }

                    public String getCommission_rate() {
                        return commission_rate;
                    }

                    public void setCommission_rate(String commission_rate) {
                        this.commission_rate = commission_rate;
                    }

                    public int getCoupon_amount() {
                        return coupon_amount;
                    }

                    public void setCoupon_amount(int coupon_amount) {
                        this.coupon_amount = coupon_amount;
                    }

                    public String getCoupon_click_url() {
                        return coupon_click_url;
                    }

                    public void setCoupon_click_url(String coupon_click_url) {
                        this.coupon_click_url = coupon_click_url;
                    }

                    public String getCoupon_end_time() {
                        return coupon_end_time;
                    }

                    public void setCoupon_end_time(String coupon_end_time) {
                        this.coupon_end_time = coupon_end_time;
                    }

                    public String getCoupon_info() {
                        return coupon_info;
                    }

                    public void setCoupon_info(String coupon_info) {
                        this.coupon_info = coupon_info;
                    }

                    public int getCoupon_remain_count() {
                        return coupon_remain_count;
                    }

                    public void setCoupon_remain_count(int coupon_remain_count) {
                        this.coupon_remain_count = coupon_remain_count;
                    }

                    public String getCoupon_share_url() {
                        return coupon_share_url;
                    }

                    public void setCoupon_share_url(String coupon_share_url) {
                        this.coupon_share_url = coupon_share_url;
                    }

                    public String getCoupon_start_fee() {
                        return coupon_start_fee;
                    }

                    public void setCoupon_start_fee(String coupon_start_fee) {
                        this.coupon_start_fee = coupon_start_fee;
                    }

                    public String getCoupon_start_time() {
                        return coupon_start_time;
                    }

                    public void setCoupon_start_time(String coupon_start_time) {
                        this.coupon_start_time = coupon_start_time;
                    }

                    public int getCoupon_total_count() {
                        return coupon_total_count;
                    }

                    public void setCoupon_total_count(int coupon_total_count) {
                        this.coupon_total_count = coupon_total_count;
                    }

                    public long getItem_id() {
                        return item_id;
                    }

                    public void setItem_id(long item_id) {
                        this.item_id = item_id;
                    }

                    public int getLevel_one_category_id() {
                        return level_one_category_id;
                    }

                    public void setLevel_one_category_id(int level_one_category_id) {
                        this.level_one_category_id = level_one_category_id;
                    }

                    public String getNick() {
                        return nick;
                    }

                    public void setNick(String nick) {
                        this.nick = nick;
                    }

                    public String getPict_url() {
                        return pict_url;
                    }

                    public void setPict_url(String pict_url) {
                        this.pict_url = pict_url;
                    }

                    public String getReserve_price() {
                        return reserve_price;
                    }

                    public void setReserve_price(String reserve_price) {
                        this.reserve_price = reserve_price;
                    }

                    public long getSeller_id() {
                        return seller_id;
                    }

                    public void setSeller_id(long seller_id) {
                        this.seller_id = seller_id;
                    }

                    public String getShop_title() {
                        return shop_title;
                    }

                    public void setShop_title(String shop_title) {
                        this.shop_title = shop_title;
                    }

                    public SmallImagesBean getSmall_images() {
                        return small_images;
                    }

                    public void setSmall_images(SmallImagesBean small_images) {
                        this.small_images = small_images;
                    }

                    @Override
                    public String getCover() {
                        return pict_url;
                    }

                    public String getTitle() {
                        return title;
                    }

                    @Override
                    public String getUrl() {
                        return coupon_click_url == null ? click_url : coupon_click_url;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public int getUser_type() {
                        return user_type;
                    }

                    public void setUser_type(int user_type) {
                        this.user_type = user_type;
                    }

                    public int getVolume() {
                        return volume;
                    }

                    public void setVolume(int volume) {
                        this.volume = volume;
                    }

                    public String getWhite_image() {
                        return white_image;
                    }

                    public void setWhite_image(String white_image) {
                        this.white_image = white_image;
                    }

                    public String getZk_final_price() {
                        return zk_final_price;
                    }

                    public void setZk_final_price(String zk_final_price) {
                        this.zk_final_price = zk_final_price;
                    }

                    public static class SmallImagesBean {
                        private List<String> string;

                        public List<String> getString() {
                            return string;
                        }

                        public void setString(List<String> string) {
                            this.string = string;
                        }
                    }
                }
            }
        }
    }
}
