package com.imperialm.imiservices.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.imperialm.imiservices.dto.RetentionGraphDTO;

@Repository
public class RetentionGraphDAOImpl implements RetentionGraphDAO {

	private static Logger logger = LoggerFactory.getLogger(RetentionGraphDAOImpl.class);

	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public List<RetentionGraphDTO> getRetentionGraphByParentTerritoryList(List<String> list) {
		List<RetentionGraphDTO> result = new ArrayList<RetentionGraphDTO>();

		try {
			final Query query = this.em.createNativeQuery(SELECT_BY_PARENT_TERRITORY_LIST, RetentionGraphDTO.class);
			query.setParameter(0, list);
			List<RetentionGraphDTO> rows = query.getResultList();
			result = rows;
		} catch (final NoResultException ex) {
			logger.info("result in else " + result);
		} catch (final Exception ex) {
			logger.error("error occured in getRetentionGraphByParentTerritoryList", ex);
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<RetentionGraphDTO> getRetentionGraphByChildTerritoryList(List<String> list) {
		List<RetentionGraphDTO> result = new ArrayList<RetentionGraphDTO>();

		try {
			final Query query = this.em.createNativeQuery(SELECT_BY_CHILD_TERRITORY_LIST, RetentionGraphDTO.class);
			query.setParameter(0, list);
			List<RetentionGraphDTO> rows = query.getResultList();
			result = rows;
		} catch (final NoResultException ex) {
			logger.info("result in else " + result);
		} catch (final Exception ex) {
			logger.error("error occured in getRetentionGraphByChildTerritoryList", ex);
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<RetentionGraphDTO> getRetentionGraphByParentTerritoryListAndPositionCode(List<String> list,
			String positionCode) {
		List<RetentionGraphDTO> result = new ArrayList<RetentionGraphDTO>();

		try {
			final Query query = this.em.createNativeQuery(SELECT_BY_PARENT_TERRITORY_LIST_AND_POSITIONCODE, RetentionGraphDTO.class);
			query.setParameter(0, list);
			query.setParameter(1, positionCode);
			List<RetentionGraphDTO> rows = query.getResultList();
			result = rows;
		} catch (final NoResultException ex) {
			logger.info("result in else " + result);
		} catch (final Exception ex) {
			logger.error("error occured in getRetentionGraphByParentTerritoryListAndPositionCode", ex);
		}
		return result;
	}

	@Override
	public List<RetentionGraphDTO> getRetentionGraphByChildTerritoryListAndPositionCode(List<String> list,
			String positionCode) {
		List<RetentionGraphDTO> result = new ArrayList<RetentionGraphDTO>();

		try {
			final Query query = this.em.createNativeQuery(SELECT_BY_CHILD_TERRITORY_LIST_AND_POSITIONCODE, RetentionGraphDTO.class);
			query.setParameter(0, list);
			query.setParameter(1, positionCode);
			List<RetentionGraphDTO> rows = query.getResultList();
			result = rows;
		} catch (final NoResultException ex) {
			logger.info("result in else " + result);
		} catch (final Exception ex) {
			logger.error("error occured in getRetentionGraphByChildTerritoryListAndPositionCode", ex);
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<RetentionGraphDTO> getRetentionGraphNATByPositionCode(String positionCode) {
		List<RetentionGraphDTO> result = new ArrayList<RetentionGraphDTO>();

		try {
			final Query query = this.em.createNativeQuery(SELECT_NAT_BY_POSITIONCODE, RetentionGraphDTO.class);
			query.setParameter(0, positionCode);
			List<RetentionGraphDTO> rows = query.getResultList();
			result = rows;
		} catch (final NoResultException ex) {
			logger.info("result in else " + result);
		} catch (final Exception ex) {
			logger.error("error occured in getRetentionGraphNATByPositionCode", ex);
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<RetentionGraphDTO> getRetentionGraphBCByBcAndPositionCodeByPositionCode(String bc, String positionCode) {
		List<RetentionGraphDTO> result = new ArrayList<RetentionGraphDTO>();

		try {
			final Query query = this.em.createNativeQuery(SELECT_BY_BC_AND_POSITIONCODE, RetentionGraphDTO.class);
			query.setParameter(1, bc);
			query.setParameter(0, positionCode);
			List<RetentionGraphDTO> rows = query.getResultList();
			result = rows;
		} catch (final NoResultException ex) {
			logger.info("result in else " + result);
		} catch (final Exception ex) {
			logger.error("error occured in getRetentionGraphBCByBcAndPositionCodeByPositionCode", ex);
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<RetentionGraphDTO> getRetentionGraphNAT() {
		List<RetentionGraphDTO> result = new ArrayList<RetentionGraphDTO>();

		try {
			final Query query = this.em.createNativeQuery(SELECT_NAT, RetentionGraphDTO.class);
			List<RetentionGraphDTO> rows = query.getResultList();
			result = rows;
		} catch (final NoResultException ex) {
			logger.info("result in else " + result);
		} catch (final Exception ex) {
			logger.error("error occured in getRetentionGraphNAT", ex);
		}
		return result;
	}

}
