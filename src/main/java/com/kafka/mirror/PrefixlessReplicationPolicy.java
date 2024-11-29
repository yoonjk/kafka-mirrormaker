package com.kafka.mirror;

import java.util.Map;

import org.apache.kafka.connect.mirror.DefaultReplicationPolicy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrefixlessReplicationPolicy extends DefaultReplicationPolicy {
	  private static final Logger log = LoggerFactory.getLogger(PrefixlessReplicationPolicy.class);

	  @Override
	  public void configure(Map<String, ?> props) {
	    super.configure(props);	    
	  }

	  @Override
	  public String formatRemoteTopic(String sourceClusterAlias, String topic) {
	    return topic;
	  }

	  @Override
	  public String topicSource(String topic) {
	    // return topic == null ? null : sourceClusterAlias;
	    return null;
	  }

	  @Override
	  public String upstreamTopic(String topic) {
	    return null;
	  }
}