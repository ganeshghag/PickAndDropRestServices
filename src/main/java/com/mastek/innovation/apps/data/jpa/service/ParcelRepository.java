/*
 * Copyright 2012-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mastek.innovation.apps.data.jpa.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mastek.innovation.apps.data.jpa.domain.Parcel;

@RepositoryRestResource(collectionResourceRel = "parcels", path = "parcels")
public interface ParcelRepository extends PagingAndSortingRepository<Parcel, Long> {

	public List<Parcel> findByPackageId(@Param("packageId") String packageId);
	
	public List<Parcel> findByPickupLocationsName(@Param("name") String name);

	@Query("select p from Parcel p where p.pickupLocations.name = :name and p.pincode like :pincode")
	public List<Parcel> findByCustom(@Param("name") String name, @Param("pincode") String pincode);
	
	public List<Parcel> findByPincode(@Param("pincode") String pincode);
}
