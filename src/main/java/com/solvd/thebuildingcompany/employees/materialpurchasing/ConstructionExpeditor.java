package com.solvd.thebuildingcompany.employees.materialpurchasing;

import com.solvd.thebuildingcompany.departments.MaterialPurchasing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class ConstructionExpeditor extends MaterialPurchasing {

    private final Logger logger = Logger.getLogger(ConstructionExpeditor.class.getName());

    public ConstructionExpeditor(String name) {
        this.setName(name);
    }

    @Override
    protected String materialsToOrder() {
        //figure out a way to incorporate louis into this
        final ArrayList<String> materialsList = new ArrayList<>();
        materialsList.add("Stone");
        materialsList.add("Kitchen island");

        logger.info("Materials I still need to order: " + materialsList.get(0));
        logger.info("Materials I still need to order: " + materialsList.get(1));
        return "Materials I still need to order: " + materialsList;
    }

    @Override
    protected String materialsOrdered() {
        //figure out a way to incorporate louis into this
        final ArrayList<String> materialsOrdered = new ArrayList<>();
        materialsOrdered.add("Steele");
        materialsOrdered.add("Cabinets");

        logger.info("Materials ordered" + materialsOrdered.get(0));
        logger.info("Materials ordered" + materialsOrdered.get(1));

        return "Materials ordered: " + materialsOrdered;
    }

    @Override
    protected String requestForProposalEvaluation() {
        final ConstructionExpeditor louis = new ConstructionExpeditor("Louis");
        louis.setProposalSent(true);

        logger.info("Proposal Evaluation Sent: " + louis.isProposalSent());

        return "Proposal Evaluation Sent: " + louis.isProposalSent();
    }

    @Override
    protected String bidEvaluation() {
        final ConstructionExpeditor grace = new ConstructionExpeditor("Grace");
        grace.setFeasible(true);
        grace.setMaintenanceCosts(5235.37);
        grace.setOperatingCosts(4392.43);

        final HashMap<String, Double> bidAssessment = new HashMap<>();
        bidAssessment.put("Maintenance costs total: $", grace.getMaintenanceCosts());
        bidAssessment.put("Operating costs total: $", grace.getOperatingCosts());

        for (Map.Entry<String, Double> set : bidAssessment.entrySet()) {
            logger.info(set.getKey());
        }

        logger.info("Material Purchase is Feasible: " + grace.isFeasible());

        return "Material Purchase is Feasible: " + grace.isFeasible();
    }

    @Override
    protected HashMap<String, Boolean> resourceManagement() {
        final ConstructionExpeditor eleanor = new ConstructionExpeditor("Eleanor");
        eleanor.setDeadlinesAreMade(true);

        HashMap<String, Boolean> onTimeOrders = new HashMap<>();
        onTimeOrders.put("The resource arrived on time: ", eleanor.isDeadlinesAreMade());

        for (Map.Entry<String, Boolean> set : onTimeOrders.entrySet()) {
            logger.info(set.getKey());
        }

        return onTimeOrders;
    }

    @Override
    protected HashMap<String, Boolean> itemDeadlines() {
        final ConstructionExpeditor violet = new ConstructionExpeditor("Violet");
        violet.setArrivedOnTime(true);

        final HashMap<String, Boolean> onTimeOrders = new HashMap<>();
        onTimeOrders.put("Order for steel arrived on schedule: ", violet.isArrivedOnTime());

        for (Map.Entry<String, Boolean> set : onTimeOrders.entrySet()) {
            logger.info(set.getKey());
        }

        return onTimeOrders;
    }

    @Override
    protected String orderChanges() {
        final ConstructionExpeditor klaus = new ConstructionExpeditor("Klaus");
        final ArrayList<String> orderChanges = new ArrayList<>();
        orderChanges.add("Add cement mixer");
        orderChanges.add("Delete stone order");

        logger.info(klaus.getName() + "made the following changes to the order: " + orderChanges.get(0));
        logger.info(klaus.getName() + "made the following changes to the order: " + orderChanges.get(1));

        return klaus.getName() + "made the following changes to the order: " + orderChanges;
    }

    @Override
    protected String contractManagement() {
        final ConstructionExpeditor sunny = new ConstructionExpeditor("Sunny");

        logger.info("All contracts were honored: " + sunny.isContractsHonored());
        return "All contracts were honored: " + sunny.isContractsHonored();
    }
}
