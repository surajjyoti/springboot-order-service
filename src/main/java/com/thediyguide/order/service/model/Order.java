package com.thediyguide.order.service.model;

import com.amazonaws.services.dynamodbv2.datamodeling.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@DynamoDBTable(tableName = "order-service-order")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    private String id;
    @DynamoDBAttribute
    private String orderNumber;
    @DynamoDBTypeConvertedJson
    private List<OrderLineItems> orderLineItemList;
}
