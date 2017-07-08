package com.footprint.common.merkletree.repository;

import com.footprint.common.merkletree.Merkle;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface MerkleRepository extends
		ElasticsearchRepository<Merkle, String> {

	@Query("{\"query\":{\"bool\":{\"must\":[{\"match\":{\"value.type\":\"?0\"}}]}},\"size\":9999}")
	Page<Merkle> findByType(String type, Pageable pageable);

}
