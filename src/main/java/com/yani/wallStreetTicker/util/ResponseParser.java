package util;

import java.util.ArrayList;
import javax.json.JsonObject;

import models.Quote;

public interface ResponseParser {
	ArrayList<Quote> parseResponse(JsonObject jsonObject);
}


