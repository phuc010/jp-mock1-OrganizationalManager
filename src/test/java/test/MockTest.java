package test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import phuc.com.fa.demomvc.controller.HomeController;
import phuc.com.fa.demomvc.entity.Organisation;
import phuc.com.fa.demomvc.page.PageAble;
import phuc.com.fa.demomvc.service.OrganisationServiceImpl;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/dispatcher-servlet.xml" })
public class MockTest {
	@Autowired
	private OrganisationServiceImpl crudService;

	@Test
	public void saveOrUpdateTest() {
		Organisation organisation = new Organisation("FPT", "FPT Co", "PhucHV2", "Nam Ki Khoi Nghia", "550000",
				"software", "0934567895");
		crudService.saveOrUpdate(organisation);

		Assert.assertEquals(crudService.findById("FPT").getOrganisationName(), "FPT");
	}

	@Test
	public void updateActiveTest() {
		Organisation organisation = new Organisation("FPT", "FPT Co", "PhucHV2", "Nam Ki Khoi Nghia", "550000",
				"software", "0934567895");
		crudService.updateActive(organisation);

		Assert.assertEquals(crudService.findById("FPT").getActive(), "Yes");
	}

	@Test
	public void findWithPageAbleTest1() {
		Organisation organisation = new Organisation("FPT", "FPT Co", "PhucHV2", "Nam Ki Khoi Nghia", "550000",
				"software", "0934567895");
		List<Organisation> organisationListActual = new ArrayList<Organisation>();
		List<Organisation> organisationListExpected = new ArrayList<Organisation>();
		PageAble pageAble = new PageAble(1);
		organisationListActual.add(organisation);
		organisationListActual.add(organisation);
		organisationListActual.add(organisation);
		organisationListActual.add(organisation);
		organisationListActual.add(organisation);
		organisationListExpected = crudService.findWithPageAble(pageAble, "all");

		Assert.assertEquals(organisationListActual.size(), organisationListExpected.size());
	}

	@Test
	public void findWithPageAbleTest2() {
		Organisation organisation = new Organisation("FPT", "FPT Co", "PhucHV2", "Nam Ki Khoi Nghia", "550000",
				"software", "0934567895");
		List<Organisation> organisationListActual = new ArrayList<Organisation>();
		List<Organisation> organisationListExpected = new ArrayList<Organisation>();
		PageAble pageAble = new PageAble(1);
		organisationListActual.add(organisation);
		organisationListActual.add(organisation);
		organisationListActual.add(organisation);
		organisationListActual.add(organisation);
		organisationListActual.add(organisation);
		organisationListExpected = crudService.findWithPageAble(pageAble, "active");

		Assert.assertEquals(organisationListActual.size(), organisationListExpected.size());
	}

	@Test
	public void findWithPageAbleTest3() {
		Organisation organisation = new Organisation("FPT", "FPT Co", "PhucHV2", "Nam Ki Khoi Nghia", "550000",
				"software", "0934567895");
		List<Organisation> organisationListActual = new ArrayList<Organisation>();
		List<Organisation> organisationListExpected = new ArrayList<Organisation>();
		PageAble pageAble = new PageAble(1);
		organisationListActual.add(organisation);
		organisationListActual.add(organisation);
		organisationListActual.add(organisation);
		organisationListActual.add(organisation);
		organisationListActual.add(organisation);
		organisationListExpected = crudService.findWithPageAble(pageAble, "09all");

		Assert.assertEquals(organisationListActual.size(), organisationListExpected.size());
	}

	@Test
	public void findWithPageAbleTest4() {
		Organisation organisation = new Organisation("1FPT", "FPT Co", "PhucHV2", "Nam Ki Khoi Nghia", "550000",
				"software", "0934567895");
		List<Organisation> organisationListActual = new ArrayList<Organisation>();
		List<Organisation> organisationListExpected = new ArrayList<Organisation>();
		PageAble pageAble = new PageAble(1);
		organisationListActual.add(organisation);
		organisationListActual.add(organisation);
		organisationListExpected = crudService.findWithPageAble(pageAble, "09active");

		Assert.assertEquals(organisationListActual.size(), organisationListExpected.size());
	}

	@Test
	public void findWithPageAbleTest5() {
		Organisation organisation = new Organisation("FPT", "FPT Co", "PhucHV2", "Nam Ki Khoi Nghia", "550000",
				"software", "0934567895");
		List<Organisation> organisationListActual = new ArrayList<Organisation>();
		List<Organisation> organisationListExpected = new ArrayList<Organisation>();
		PageAble pageAble = new PageAble(1);
		organisationListActual.add(organisation);
		organisationListActual.add(organisation);
		organisationListActual.add(organisation);
		organisationListActual.add(organisation);
		organisationListActual.add(organisation);
		organisationListExpected = crudService.findWithPageAble(pageAble, "aeall");

		Assert.assertEquals(organisationListActual.size(), organisationListExpected.size());
	}

	@Test
	public void findWithPageAbleTest6() {
		Organisation organisation = new Organisation("aFPT", "FPT Co", "PhucHV2", "Nam Ki Khoi Nghia", "550000",
				"software", "0934567895");
		List<Organisation> organisationListActual = new ArrayList<Organisation>();
		List<Organisation> organisationListExpected = new ArrayList<Organisation>();
		PageAble pageAble = new PageAble(1);
		organisationListActual.add(organisation);
		organisationListExpected = crudService.findWithPageAble(pageAble, "aeactive");

		Assert.assertEquals(organisationListActual.size(), organisationListExpected.size());
	}

	@Test
	public void findWithPageAbleTest7() {
		Organisation organisation = new Organisation("FPT", "FPT Co", "PhucHV2", "Nam Ki Khoi Nghia", "550000",
				"software", "0934567895");
		List<Organisation> organisationListActual = new ArrayList<Organisation>();
		List<Organisation> organisationListExpected = new ArrayList<Organisation>();
		PageAble pageAble = new PageAble(1);
		organisationListActual.add(organisation);
		organisationListActual.add(organisation);
		organisationListExpected = crudService.findWithPageAble(pageAble, "fjall");

		Assert.assertEquals(organisationListActual.size(), organisationListExpected.size());
	}

	@Test
	public void findWithPageAbleTest8() {
		Organisation organisation = new Organisation("FPT", "FPT Co", "PhucHV2", "Nam Ki Khoi Nghia", "550000",
				"software", "0934567895");
		List<Organisation> organisationListActual = new ArrayList<Organisation>();
		List<Organisation> organisationListExpected = new ArrayList<Organisation>();
		PageAble pageAble = new PageAble(1);
		organisationListActual.add(organisation);
		organisationListExpected = crudService.findWithPageAble(pageAble, "fjactive");

		Assert.assertEquals(organisationListActual.size(), organisationListExpected.size());
	}

	@Test
	public void findWithPageAbleTest9() {
		Organisation organisation = new Organisation("FPT", "FPT Co", "PhucHV2", "Nam Ki Khoi Nghia", "550000",
				"software", "0934567895");
		List<Organisation> organisationListActual = new ArrayList<Organisation>();
		List<Organisation> organisationListExpected = new ArrayList<Organisation>();
		PageAble pageAble = new PageAble(1);
		organisationListActual.add(organisation);
		organisationListExpected = crudService.findWithPageAble(pageAble, "knall");

		Assert.assertEquals(organisationListActual.size(), organisationListExpected.size());
	}

	@Test
	public void findWithPageAbleTest10() {
		Organisation organisation = new Organisation("FPT", "FPT Co", "PhucHV2", "Nam Ki Khoi Nghia", "550000",
				"software", "0934567895");
		List<Organisation> organisationListActual = new ArrayList<Organisation>();
		List<Organisation> organisationListExpected = new ArrayList<Organisation>();
		PageAble pageAble = new PageAble(1);
		organisationListActual.add(organisation);
		organisationListExpected = crudService.findWithPageAble(pageAble, "knactive");

		Assert.assertEquals(organisationListActual.size(), organisationListExpected.size());
	}

	@Test
	public void findWithPageAbleTest11() {
		Organisation organisation = new Organisation("FPT", "FPT Co", "PhucHV2", "Nam Ki Khoi Nghia", "550000",
				"software", "0934567895");
		List<Organisation> organisationListActual = new ArrayList<Organisation>();
		List<Organisation> organisationListExpected = new ArrayList<Organisation>();
		PageAble pageAble = new PageAble(1);
		organisationListActual.add(organisation);
		organisationListActual.add(organisation);
		organisationListExpected = crudService.findWithPageAble(pageAble, "orall");

		Assert.assertEquals(organisationListActual.size(), organisationListExpected.size());
	}

	@Test
	public void findWithPageAbleTest12() {
		List<Organisation> organisationListActual = new ArrayList<Organisation>();
		List<Organisation> organisationListExpected = new ArrayList<Organisation>();
		PageAble pageAble = new PageAble(1);
		organisationListExpected = crudService.findWithPageAble(pageAble, "oractive");

		Assert.assertEquals(organisationListActual.size(), organisationListExpected.size());
	}

	@Test
	public void findWithPageAbleTest13() {
		Organisation organisation = new Organisation("FPT", "FPT Co", "PhucHV2", "Nam Ki Khoi Nghia", "550000",
				"software", "0934567895");
		List<Organisation> organisationListActual = new ArrayList<Organisation>();
		List<Organisation> organisationListExpected = new ArrayList<Organisation>();
		PageAble pageAble = new PageAble(1);
		organisationListActual.add(organisation);
		organisationListActual.add(organisation);
		organisationListActual.add(organisation);
		organisationListActual.add(organisation);
		organisationListActual.add(organisation);
		organisationListExpected = crudService.findWithPageAble(pageAble, "svall");

		Assert.assertEquals(organisationListActual.size(), organisationListExpected.size());
	}

	@Test
	public void findWithPageAbleTest14() {
		Organisation organisation = new Organisation("FPT", "FPT Co", "PhucHV2", "Nam Ki Khoi Nghia", "550000",
				"software", "0934567895");
		List<Organisation> organisationListActual = new ArrayList<Organisation>();
		List<Organisation> organisationListExpected = new ArrayList<Organisation>();
		PageAble pageAble = new PageAble(1);
		organisationListActual.add(organisation);
		organisationListActual.add(organisation);
		organisationListExpected = crudService.findWithPageAble(pageAble, "svactive");

		Assert.assertEquals(organisationListActual.size(), organisationListExpected.size());
	}

	@Test
	public void findWithPageAbleTest15() {
		List<Organisation> organisationListActual = new ArrayList<Organisation>();
		List<Organisation> organisationListExpected = new ArrayList<Organisation>();
		PageAble pageAble = new PageAble(1);
		organisationListExpected = crudService.findWithPageAble(pageAble, "wzall");

		Assert.assertEquals(organisationListActual.size(), organisationListExpected.size());
	}

	@Test
	public void findWithPageAbleTest16() {
		List<Organisation> organisationListActual = new ArrayList<Organisation>();
		List<Organisation> organisationListExpected = new ArrayList<Organisation>();
		PageAble pageAble = new PageAble(1);
		organisationListExpected = crudService.findWithPageAble(pageAble, "wzactive");

		Assert.assertEquals(organisationListActual.size(), organisationListExpected.size());
	}

	@Test
	public void totalPages1() {
		PageAble pageAble = new PageAble(1);
		int totalPagesActual = 0;
		totalPagesActual = crudService.totalPages(pageAble, "all");
		Assert.assertEquals(totalPagesActual, 6);
	}

	@Test
	public void totalPages2() {
		PageAble pageAble = new PageAble(1);
		int totalPagesActual = 0;
		totalPagesActual = crudService.totalPages(pageAble, "active");
		Assert.assertEquals(totalPagesActual, 2);
	}

	@Test
	public void totalPages3() {
		PageAble pageAble = new PageAble(1);
		int totalPagesActual = 0;
		totalPagesActual = crudService.totalPages(pageAble, "09all");
		Assert.assertEquals(totalPagesActual, 1);
	}

	@Test
	public void totalPages4() {
		PageAble pageAble = new PageAble(1);
		int totalPagesActual = 0;
		totalPagesActual = crudService.totalPages(pageAble, "09active");
		Assert.assertEquals(totalPagesActual, 1);
	}

	@Test
	public void totalPages5() {
		PageAble pageAble = new PageAble(1);
		int totalPagesActual = 0;
		totalPagesActual = crudService.totalPages(pageAble, "aeall");
		Assert.assertEquals(totalPagesActual, 2);
	}

	@Test
	public void totalPages6() {
		PageAble pageAble = new PageAble(1);
		int totalPagesActual = 0;
		totalPagesActual = crudService.totalPages(pageAble, "aeactive");
		Assert.assertEquals(totalPagesActual, 1);
	}

	@Test
	public void totalPages7() {
		PageAble pageAble = new PageAble(1);
		int totalPagesActual = 0;
		totalPagesActual = crudService.totalPages(pageAble, "fjall");
		Assert.assertEquals(totalPagesActual, 1);
	}

	@Test
	public void totalPages8() {
		PageAble pageAble = new PageAble(1);
		int totalPagesActual = 0;
		totalPagesActual = crudService.totalPages(pageAble, "fjactive");
		Assert.assertEquals(totalPagesActual, 1);
	}

	@Test
	public void totalPages9() {
		PageAble pageAble = new PageAble(1);
		int totalPagesActual = 0;
		totalPagesActual = crudService.totalPages(pageAble, "knall");
		Assert.assertEquals(totalPagesActual, 1);
	}

	@Test
	public void totalPages10() {
		PageAble pageAble = new PageAble(1);
		int totalPagesActual = 0;
		totalPagesActual = crudService.totalPages(pageAble, "knactive");
		Assert.assertEquals(totalPagesActual, 1);
	}

	@Test
	public void totalPages11() {
		PageAble pageAble = new PageAble(1);
		int totalPagesActual = 0;
		totalPagesActual = crudService.totalPages(pageAble, "orall");
		Assert.assertEquals(totalPagesActual, 1);
	}

	@Test
	public void totalPages12() {
		PageAble pageAble = new PageAble(1);
		int totalPagesActual = 0;
		totalPagesActual = crudService.totalPages(pageAble, "oractive");
		Assert.assertEquals(totalPagesActual, 0);
	}

	@Test
	public void totalPages13() {
		PageAble pageAble = new PageAble(1);
		int totalPagesActual = 0;
		totalPagesActual = crudService.totalPages(pageAble, "svall");
		Assert.assertEquals(totalPagesActual, 2);
	}

	@Test
	public void totalPages14() {
		PageAble pageAble = new PageAble(1);
		int totalPagesActual = 0;
		totalPagesActual = crudService.totalPages(pageAble, "svactive");
		Assert.assertEquals(totalPagesActual, 1);
	}

	@Test
	public void totalPages15() {
		PageAble pageAble = new PageAble(1);
		int totalPagesActual = 0;
		totalPagesActual = crudService.totalPages(pageAble, "wzall");
		Assert.assertEquals(totalPagesActual, 0);
	}

	@Test
	public void totalPages16() {
		PageAble pageAble = new PageAble(1);
		int totalPagesActual = 0;
		totalPagesActual = crudService.totalPages(pageAble, "wzactive");
		Assert.assertEquals(totalPagesActual, 0);
	}

	@Test
	public void createTest1() {
		Organisation organisation = new Organisation("FPT", "FPT Co", "PhucHV2", "Nam Ki Khoi Nghia", "550000",
				"software", "0934567895");
		HomeController homeController = new HomeController();

		Assert.assertEquals(homeController.create(null, organisation.getOrganisationName(), organisation.getPhone(),
				organisation.getPostCode(), organisation), "error");
	}

}
