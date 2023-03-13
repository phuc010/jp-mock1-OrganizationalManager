package phuc.com.fa.demomvc.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import phuc.com.fa.demomvc.entity.Organisation;
import phuc.com.fa.demomvc.page.PageAble;
import phuc.com.fa.demomvc.repository.OrganisationRepositoryImpl;

/* class OrganisationServiceImpl Performing operations and processing logic */
@Service
public class OrganisationServiceImpl {
    @Autowired
    private OrganisationRepositoryImpl organisationRepositoryImpl;
    
    @Transactional
    public List<Organisation> findAll(){
    	return organisationRepositoryImpl.findAll();
    }
    
    @Transactional
    public boolean checkName(String name){
    	return organisationRepositoryImpl.checkName(name);
    }
    
    @Transactional
    public List<Organisation> sort(PageAble pageAble,String checkme){
    	return organisationRepositoryImpl.sort(pageAble, checkme);
    }
    
    @Transactional
    public void saveOrUpdate(Organisation organisation) {
        organisationRepositoryImpl.saveOrUpdate(organisation);
    }

    @Transactional
    public void updateActive(Organisation organisation) {
        organisationRepositoryImpl.updateActive(organisation);
    }

    @Transactional
    public List<Organisation> findWithPageAble(PageAble pageAble, String keySplit) {
        return organisationRepositoryImpl.findWithPageAble(pageAble, keySplit);
    }

    @Transactional
    public int totalPages(PageAble pageAble, String keySplit) {
        long totalRecord = organisationRepositoryImpl.count(keySplit);
        return (int) Math.ceil((double) totalRecord / pageAble.getSize());
    }

    @Transactional
    public Organisation findById(long stt) {
        return organisationRepositoryImpl.findById(stt);
    }
}
