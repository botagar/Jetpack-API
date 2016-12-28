package jetpack.repository

import jetpack.domain.Customer
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource
interface CustomerRepository : CrudRepository<Customer, Long>, PagingAndSortingRepository<Customer, Long>
