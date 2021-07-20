package com.ym;


import org.elasticsearch.action.admin.indices.mapping.put.PutMappingRequest;
import org.elasticsearch.client.Requests;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.junit.Test;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Hello world!
 */
public class App {
    //创建索引
    @Test
    public void test() throws UnknownHostException {
        //创建client连接对象
        Settings settrings = Settings.builder().put("cluster.name", "my-elasticsearch").build();
        TransportClient client = new PreBuiltTransportClient(settrings);
        client.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("127.0.0.1"), 9300));

        //创建名称为blog2的索引
        client.admin().indices().prepareCreate("node2").get();
        //释放资源
        client.close();
    }

    //创建映射
    @Test
    public void test2() throws IOException {
        //创建client连接对象
        Settings settrings = Settings.builder().put("cluster.name", "my-elasticsearch").build();
        TransportClient client = new PreBuiltTransportClient(settrings);
        client.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("127.0.0.1"), 9300));
        //添加映射
        /**
         *  格式：
         * * "mappings" : {
         * "article" : {
         * "properties" : {
         * "id" : { "type" : "string" },
         * "content" : { "type" : "string" },
         * "author" : { "type" : "string" }
         * }
         * }
         * }
         */

        XContentBuilder builder = XContentFactory.jsonBuilder();
            builder.startObject().startObject("article").startObject("properties")
                    .startObject("id")
                        .field("type","integer").field("store","yes")
                    .endObject()
                    .startObject("title")
                        .field("type","string").field("store","yes").field("analyzer","standard")
                    .endObject()
                    .startObject("content")
                        .field("type","string").field("store","yes").field("analyzer","standard")
                    .endObject()
            .endObject().endObject().endObject();
        //创建映射
        PutMappingRequest mapping = Requests.putMappingRequest("node2").type("article").source(builder);
        client.admin().indices().putMapping(mapping).get();
        //释放资源
        client.close();




    }
}
