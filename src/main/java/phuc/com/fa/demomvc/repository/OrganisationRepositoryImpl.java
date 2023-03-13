package phuc.com.fa.demomvc.repository;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import phuc.com.fa.demomvc.entity.Organisation;
import phuc.com.fa.demomvc.page.PageAble;

/* class OrganisationRepositoryImpl Responsible for communicating with DBs, 
 * storage devices, query processing, and returning data types requested by the Service layer. */
@Repository
public class OrganisationRepositoryImpl {

    @Autowired
    private SessionFactory sessionFactory;

    public void saveOrUpdate(Organisation organisation) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(organisation);
    }
    
    public List<Organisation> findAll() {
    	Session session = sessionFactory.getCurrentSession();
		List<Organisation> organisationsList = session.createQuery("SELECT p FROM Organisation p", Organisation.class).getResultList();
		return organisationsList;
    }
    
    @Modifying
    public boolean checkName(String name) {
		List<Organisation> organisationsList = findAll();
		int sizeList = organisationsList.size();
		for (int i = 0; i < sizeList; i++) {
			if (name.equalsIgnoreCase(organisationsList.get(i).getOrganisationName())) {
				return true;
			}
		}
		return false;
    }
    
    @Modifying
    public List<Organisation> sort(PageAble pageAble, String checkme){
    	Session session = sessionFactory.getCurrentSession();
		List<Organisation> organisationsList = session.createQuery("SELECT p FROM Organisation p order by p.organisationName", Organisation.class).setFirstResult(pageAble.getOffset()).setMaxResults(pageAble.getSize()).getResultList();
		return organisationsList;
    }

    @Modifying
    public void updateActive(Organisation organisation) {
        Session session = sessionFactory.getCurrentSession();
        Query<?> createQuery6 = session
                .createQuery("update Organisation p set p.active = 'Yes' where p.organisationName = :updateKey");
        createQuery6.setParameter("updateKey", organisation.getOrganisationName());
        createQuery6.executeUpdate();
    }
    @Modifying
    public List<Organisation> findWithPageAble(PageAble pageAble, String keySplit) {
        List<Organisation> organisations = null;
        Session session = sessionFactory.getCurrentSession();
        switch (keySplit) {
        case "all":
            organisations = session.createQuery("SELECT p FROM Organisation p", Organisation.class)
                    .setFirstResult(pageAble.getOffset()).setMaxResults(pageAble.getSize()).getResultList();
            break;
        case "active":
            organisations = session
                    .createQuery("SELECT p FROM Organisation p where p.active = 'Yes'", Organisation.class)
                    .setFirstResult(pageAble.getOffset()).setMaxResults(pageAble.getSize()).getResultList();
            break;
        case "09all":
            organisations = session
                    .createQuery("SELECT p FROM Organisation p where p.organisationName like '[123456789]%'",
                            Organisation.class)
                    .setFirstResult(pageAble.getOffset()).setMaxResults(pageAble.getSize()).getResultList();
            break;
        case "09active":
            organisations = session.createQuery(
                    "SELECT p FROM Organisation p where p.organisationName like '[123456789]%' and p.active = 'Yes'",
                    Organisation.class).setFirstResult(pageAble.getOffset()).setMaxResults(pageAble.getSize())
                    .getResultList();
            break;
        case "aeall":
            organisations = session
                    .createQuery("SELECT p FROM Organisation p where p.organisationName like '[abcde]%'",
                            Organisation.class)
                    .setFirstResult(pageAble.getOffset()).setMaxResults(pageAble.getSize()).getResultList();
            break;
        case "aeactive":
            organisations = session.createQuery(
                    "SELECT p FROM Organisation p where p.organisationName like '[abcde]%' and p.active = 'Yes'",
                    Organisation.class).setFirstResult(pageAble.getOffset()).setMaxResults(pageAble.getSize())
                    .getResultList();
            break;
        case "fjall":
            organisations = session
                    .createQuery("SELECT p FROM Organisation p where p.organisationName like '[fghij]%'",
                            Organisation.class)
                    .setFirstResult(pageAble.getOffset()).setMaxResults(pageAble.getSize()).getResultList();
            break;
        case "fjactive":
            organisations = session.createQuery(
                    "SELECT p FROM Organisation p where p.organisationName like '[fghij]%' and p.active = 'Yes'",
                    Organisation.class).setFirstResult(pageAble.getOffset()).setMaxResults(pageAble.getSize())
                    .getResultList();
            break;
        case "knall":
            organisations = session
                    .createQuery("SELECT p FROM Organisation p where p.organisationName like '[klmn]%'",
                            Organisation.class)
                    .setFirstResult(pageAble.getOffset()).setMaxResults(pageAble.getSize()).getResultList();
            break;
        case "knactive":
            organisations = session
                    .createQuery(
                            "SELECT p FROM Organisation p where p.organisationName like '[klmn]%' and p.active = 'Yes'",
                            Organisation.class)
                    .setFirstResult(pageAble.getOffset()).setMaxResults(pageAble.getSize()).getResultList();
            break;
        case "orall":
            organisations = session
                    .createQuery("SELECT p FROM Organisation p where p.organisationName like '[opqr]%'",
                            Organisation.class)
                    .setFirstResult(pageAble.getOffset()).setMaxResults(pageAble.getSize()).getResultList();
            break;
        case "oractive":
            organisations = session
                    .createQuery(
                            "SELECT p FROM Organisation p where p.organisationName like '[opqr]%' and p.active = 'Yes'",
                            Organisation.class)
                    .setFirstResult(pageAble.getOffset()).setMaxResults(pageAble.getSize()).getResultList();
            break;
        case "svall":
            organisations = session
                    .createQuery("SELECT p FROM Organisation p where p.organisationName like '[stuv]%'",
                            Organisation.class)
                    .setFirstResult(pageAble.getOffset()).setMaxResults(pageAble.getSize()).getResultList();
            break;
        case "svactive":
            organisations = session
                    .createQuery(
                            "SELECT p FROM Organisation p where p.organisationName like '[stuv]%' and p.active = 'Yes'",
                            Organisation.class)
                    .setFirstResult(pageAble.getOffset()).setMaxResults(pageAble.getSize()).getResultList();
            break;
        case "wzall":
            organisations = session
                    .createQuery("SELECT p FROM Organisation p where p.organisationName like '[wxyz]%'",
                            Organisation.class)
                    .setFirstResult(pageAble.getOffset()).setMaxResults(pageAble.getSize()).getResultList();
            break;
        case "wzactive":
            organisations = session
                    .createQuery(
                            "SELECT p FROM Organisation p where p.organisationName like '[wxyz]%' and p.active = 'Yes'",
                            Organisation.class)
                    .setFirstResult(pageAble.getOffset()).setMaxResults(pageAble.getSize()).getResultList();
            break;
        default:
            break;
        }
        return organisations;
    }
    @Modifying
    public long count(String keySplit) {
        Long result = null;
        Session session = sessionFactory.getCurrentSession();
        switch (keySplit) {
        case "all":
            result = session.createQuery("SELECT COUNT(*) FROM Organisation p", Long.class).getSingleResult();
            break;
        case "active":
            result = session.createQuery("SELECT COUNT(*) FROM Organisation p where p.active = 'Yes'", Long.class)
                    .getSingleResult();
            break;
        case "09all":
            result = session
                    .createQuery("SELECT COUNT(*) FROM Organisation p where p.organisationName like '[123456789]%'",
                            Long.class)
                    .getSingleResult();
            break;
        case "09active":
            result = session.createQuery(
                    "SELECT COUNT(*) FROM Organisation p where p.organisationName like '[123456789]%' and p.active = 'Yes'",
                    Long.class).getSingleResult();
            break;
        case "aeall":
            result = session.createQuery("SELECT COUNT(*) FROM Organisation p where p.organisationName like '[abcde]%'",
                    Long.class).getSingleResult();
            break;
        case "aeactive":
            result = session.createQuery(
                    "SELECT COUNT(*) FROM Organisation p where p.organisationName like '[abcde]%' and p.active = 'Yes'",
                    Long.class).getSingleResult();
            break;
        case "fjall":
            result = session.createQuery("SELECT COUNT(*) FROM Organisation p where p.organisationName like '[fghij]%'",
                    Long.class).getSingleResult();
            break;
        case "fjactive":
            result = session.createQuery(
                    "SELECT COUNT(*) FROM Organisation p where p.organisationName like '[fghij]%' and p.active = 'Yes'",
                    Long.class).getSingleResult();
            break;
        case "knall":
            result = session.createQuery("SELECT COUNT(*) FROM Organisation p where p.organisationName like '[klmn]%'",
                    Long.class).getSingleResult();
            break;
        case "knactive":
            result = session.createQuery(
                    "SELECT COUNT(*) FROM Organisation p where p.organisationName like '[klmn]%' and p.active = 'Yes'",
                    Long.class).getSingleResult();
            break;
        case "orall":
            result = session.createQuery("SELECT COUNT(*) FROM Organisation p where p.organisationName like '[opqr]%'",
                    Long.class).getSingleResult();
            break;
        case "oractive":
            result = session.createQuery(
                    "SELECT COUNT(*) FROM Organisation p where p.organisationName like '[opqr]%' and p.active = 'Yes'",
                    Long.class).getSingleResult();
            break;
        case "svall":
            result = session.createQuery("SELECT COUNT(*) FROM Organisation p where p.organisationName like '[stuv]%'",
                    Long.class).getSingleResult();
            break;
        case "svactive":
            result = session.createQuery(
                    "SELECT COUNT(*) FROM Organisation p where p.organisationName like '[stuv]%' and p.active = 'Yes'",
                    Long.class).getSingleResult();
            break;
        case "wzall":
            result = session.createQuery("SELECT COUNT(*) FROM Organisation p where p.organisationName like '[wxyz]%'",
                    Long.class).getSingleResult();
            break;
        case "wzactive":
            result = session.createQuery(
                    "SELECT COUNT(*) FROM Organisation p where p.organisationName like '[wxyz]%' and p.active = 'Yes'",
                    Long.class).getSingleResult();
            break;
        }
        return result;
    }

	public Organisation findById(long stt) {
        Session session = sessionFactory.getCurrentSession();
        return session.find(Organisation.class, stt);
    }
}
