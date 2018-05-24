package com.example.lenovo.love.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.lenovo.love.R;
import com.example.lenovo.love.adapter.MyRecyclerAdapter;
import com.example.lenovo.love.bean.Bean;

import java.util.ArrayList;
import java.util.List;

public class Main3ShouActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;

    private List<Bean> list = new ArrayList<>();

    private String s1 = "https://mp.weixin.qq.com/s?__biz=MzAwMTEyMjY4Mw==&mid=2652151069&idx=6&sn=348e906b85fce7ef9356a06bfe3ec9b9&chksm=813eb509b6493c1fca9347617f4b089d03c119ea9ace0f1f7ade4f245c45590b3173f52d1dcf&mpshare=1&scene=1&srcid=05113eBPr01dVmiEe8iucUrf#rd";
    private String s2 = "https://mp.weixin.qq.com/s?__biz=MzAxMzI4Mjg1MQ==&mid=2651646352&idx=1&sn=a3080ba93b30db74bbb64d587acab7b7&chksm=805cb2dcb72b3bca400ca670a01f71e2adcfadf8799275648248ca9141d598e1726dddaf4cba&mpshare=1&scene=1&srcid=0511q0TIt10Kw7oNLQzhEIAl#rd";
    private String s3 = "https://mp.weixin.qq.com/s?__biz=MjM5OTc2NTA5Mw==&mid=2651649262&idx=1&sn=1445684589a0a6c711f8fa33e2431189&chksm=bcce21e48bb9a8f22774aefd75875ccb3ecf8afadd30cbb2c7c11ccec3e719545aa28b488d86&mpshare=1&scene=1&srcid=0511HHOWYJ0rMYJWI1bRFU8R#rd";
    private String s4 = "https://mp.weixin.qq.com/s?__biz=MjM5Nzk4OTExMg==&mid=2650907272&idx=1&sn=307eb0fc18b77d4ca1591d11de25ad90&chksm=bd249d1f8a5314093d3886b00dd7fe5f91b4833af9f091bd03de5d7e5038a6e115ae4f2a53f4&mpshare=1&scene=1&srcid=0511RAbpBk7JDargJM75c9sI#rd";
    private String s5 = "https://mp.weixin.qq.com/s?__biz=MzA3NjM4MzUzOQ==&mid=2656969374&idx=1&sn=91aa24a92d742bbced96ca25dc76686a&chksm=84c896c2b3bf1fd4a59da22bff80b61f0c2e7f86added651839595df7a63699440878b798f55&mpshare=1&scene=1&srcid=0511CgG9XhZvoHNgIs8Fbfew#rd";
    private String s6 = "https://mp.weixin.qq.com/s?__biz=MzA4OTU5NjA2Ng==&mid=2653506391&idx=2&sn=a40c0093856b5d82fab3d4bdf7641411&chksm=8bc5629abcb2eb8c9f092b76b2851bc4b0b3634d7273206c37e6fc7d7de99147508aa39a0f6a&mpshare=1&scene=1&srcid=0511Wwv8f65DEnHbYpYuzB6v#rd";
    private String s7 = "https://mp.weixin.qq.com/s?__biz=MjM5NTUzMTM2MQ==&mid=2650360485&idx=1&sn=09505cdf256dc047e6be4fdb23a6c4cf&chksm=befaf5ab898d7cbd30041b2962af5e4595e8a7b52fbc815794bda03728e53ed";
    private String s8 = "https://mp.weixin.qq.com/s?__biz=MjM5NTgwMTYzMg==&mid=2651511740&idx=2&sn=503fc8a8547673c068f0c6efb0d7a807&chksm=bd0c84f38a7b0de522bdac15c39306fb75aafadd4d2ed69471d9cd1b9e5fdc750305c346693a&mpshare=1&scene=1&srcid=0511ZPfXxIr9B5qkQQD2Zt8y#rd";
    private String s9 = "https://mp.weixin.qq.com/s?__biz=MzA4NzAyNTc2NA==&mid=2719077929&idx=1&sn=9b7ead626bae0661de227a2f635c053d&chksm=b7dac72280ad4e34cf0c1c24673bb8061fb539d6a05f78448681cf7d88d543d3c856e56dce95&mpshare=1&scene=1&srcid=05113JsNBaGGYSx9DcLVUOa9#rd";
    private String s10 = "https://mp.weixin.qq.com/s?__biz=MjM5OTA5MTg0Nw==&mid=2650474115&idx=1&sn=961e25babe20e114ff4a92ef1feea594&chksm=becf6d6b89b8e47ddcafc463ffe842d0d14df17dd55e7166e10e0cb297d0c849050e01528e37&mpshare=1&scene=1&srcid=0511QNdHBpZfV6gkyBkvgNDg#rd";
    private String s11 = "https://mp.weixin.qq.com/s?__biz=MjM5NDcwMzA4Mw==&mid=2653747432&idx=1&sn=79cdd9d541c02470303615ed210e3ef5&chksm=bd5beb6c8a2c627acc1e358608a4b97f6fec1865c330f90d1b10beb02120de7b9d3515d80afd&mpshare=1&scene=1&srcid=0511sO97w1H5x7WusASLVUbA#rd";
    private String s12 = "https://mp.weixin.qq.com/s?__biz=MzA4ODA3NTEzNg==&mid=2649553266&idx=1&sn=a1cb31e5d762f364688414a713a2c288&chksm=8837e79dbf406e8b9daeb6a060e8844d7cda055a1e1970095065777cfc5e64a7a8debc56474c&mpshare=1&scene=1&srcid=0511dNcriE5jPuLw6ouMlJZl#rd";
    private String s13 = "https://mp.weixin.qq.com/s?__biz=MjM5ODM2NjM2MQ==&mid=2653390181&idx=2&sn=0e8a8c970f5b238be53004fa672c7fcd&chksm=bd18f8938a6f71858ec30a96fa2303cc2c54ac6b116bf884873367ae29dd61f9d7dba3529e1a&mpshare=1&scene=1&srcid=0511Q2YCBTx4eSxU1WyI34ZG#rd";
    private String s14 = "https://mp.weixin.qq.com/s?__biz=MzA3MjYwOTMwNQ==&mid=2653865007&idx=3&sn=9b02b6a288ca57e2953a75ea313ba68e&chksm=84c1df59b3b6564fd722a9ebe8b0e16c19ae280da2420bb485a66cf36d77b17a21d3b46431a2&mpshare=1&scene=1&srcid=05118Qm0iw28RWS5Z3N0oKdM#rd";
    private String s15 = "https://mp.weixin.qq.com/s?__biz=MjM5MzE1MjcxNw==&mid=2247483692&idx=1&sn=f0c575f22c972b01527e21ea682607bc&chksm=a69a2a8e91eda3985ef85aaa75892cab4ab5c424d203e84560dd";
    private String s16 = "https://mp.weixin.qq.com/s?__biz=MjM5ODU5ODcyNA==&mid=2652914419&idx=1&sn=5d9559f2eec2fbfe4e5e04afed751c36&chksm=bd1ca3d88a6b2acedf725debcfeb11eb963dff1d24057cb68f0b121599749d153eacf810568d&mpshare=1&scene=1&srcid=0511Zl5TqmKsKyiaA5Nz4b0w#rd";
    private String s17 = "https://mp.weixin.qq.com/s?__biz=MjM5MDY0MTk3Ng==&mid=2650610448&idx=1&sn=c06a5ebdcbf05b8da1086bd0971e776c&chksm=be480147893f88514949943b4f79b17bbaff0dc99151a46a952210850ff8157f204569d7595d&mpshare=1&scene=1&srcid=0511bXnDprlrkMmsrp4nMXls#rd";
    private String s18 = "https://mp.weixin.qq.com/s?__biz=MzA3NjIyNjY3NA==&mid=2667562433&idx=1&sn=98297d55632eb984dc61f7282601b11d&chksm=846fecdcb31865ca9e49109eb767e2d1deb82f7ccfdea7700f36733a439695c0749e31a5bfab&mpshare=1&scene=1&srcid=0511yvHQFrArOVoVYKpr2xmx#rd";
    private String s19 = "https://mp.weixin.qq.com/s?__biz=MjM5NDUzMTkwMA==&mid=2651347681&idx=1&sn=b03bfb1af2c693e12d82ba137bafca85&chksm=bd7aa5b28a0d2ca4bf9bda0b70ac293d8892c23257095b01f4939cd50dcb0d4d3157b896c59f&mpshare=1&scene=1&srcid=0511OGgI71Bcw0Zkg5TBOnPh#rd";
    private String s20 = "https://mp.weixin.qq.com/s?__biz=MzAwOTM5OTYwNA==&mid=2651087907&idx=5&sn=d652b2e84917e9e8989975a335350268&chksm=8090f878b7e7716edf4d2b317c8d02ca3a90fb2da662f0fd3d5dd6da8db16dfcf05bd90919c9&mpshare=1&scene=1&srcid=0511BG3zYOrBAMAXAJfT1R1V#rd";
    private String s21 = "https://mp.weixin.qq.com/s?__biz=MzA5ODg4NzkzOQ==&mid=2650385627&idx=1&sn=cf1d2bdcca1577ba76ab8dd1b3041dbd&chksm=8887bcb7bff035a1e3b5325ef5bcf15e9ab790edb11489cf7c08e4e2759ae93e58e967b6712e&mpshare=1&scene=1&srcid=05118jFehOpQw0pZULOuCqjb#rd";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        initView();
        initData();
    }

    private void initData() {
        list.add(new Bean(R.mipmap.a, "牵着你的手，我们一起走", s1));
        list.add(new Bean(R.mipmap.b, "为什么笑着笑着就哭了", s2));
        list.add(new Bean(R.mipmap.c, "母亲节，不只有鲜花，还有...", s3));
        list.add(new Bean(R.mipmap.d, "母亲节，晒晒你和母后大人的日常对话", s4));
        list.add(new Bean(R.mipmap.e, "母亲节 | 想给你一辈子的爱", s5));
        list.add(new Bean(R.mipmap.f, "太后年轻时候竟然这么好看？", s6));
        list.add(new Bean(R.mipmap.g, "爱 ，不能等", s7));
        list.add(new Bean(R.mipmap.h, "容我在你老之前，学会疼爱你", s8));
        list.add(new Bean(R.mipmap.i, "母亲节的求生之路！", s9));
        list.add(new Bean(R.mipmap.j, "把当年的那个“女神”还给爸爸吧", s10));
        list.add(new Bean(R.mipmap.k, "每个人都有一个具体的妈妈", s11));
        list.add(new Bean(R.mipmap.l, "用自己的方式，不负她的芳华", s12));
        list.add(new Bean(R.mipmap.m, "我愿做你永远的宝贝", s13));
        list.add(new Bean(R.mipmap.n, "感恩母爱", s14));
        list.add(new Bean(R.mipmap.o, "让爱回家", s15));
        list.add(new Bean(R.mipmap.p, "为什么我的妈妈是所向披靡的女战士？", s16));
        list.add(new Bean(R.mipmap.r, "让爱不等待", s17));
        list.add(new Bean(R.mipmap.s, "致 这个世界上最爱我的人", s18));
        list.add(new Bean(R.mipmap.t, "母亲节绘本推送", s19));
        list.add(new Bean(R.mipmap.u, "你与母亲的那些瞬间", s20));
        list.add(new Bean(R.mipmap.w, "久违的旋律唱响永恒的母爱", s21));


        MyRecyclerAdapter adapter = new MyRecyclerAdapter(R.layout.layout_item, list);
//动画效果
        adapter.openLoadAnimation(BaseQuickAdapter.SCALEIN);
        mRecyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                String url = list.get(position).getUrl();
                Intent intent = new Intent(Main3ShouActivity.this, Main4WebViewActivity.class);
                intent.putExtra("url",url);

                startActivity(intent);
            }
        });
    }



    private void initView() {
        mRecyclerView = (RecyclerView) findViewById(R.id.mRecyclerView);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(manager);

    }
}
