package com.cupidmeet.userdetailsservice.matching.service;

import com.cupidmeet.userdetailsservice.matching.model.types.ReactionOutcome;
import com.cupidmeet.userdetailsservice.matching.model.types.ReactionType;

import java.util.List;
import java.util.UUID;

/**
 * Сервис для работы с оценками пользователей.
 */
public interface UserEvaluationService {

    /**
     * Получить список идентификаторов пользователей, которые были оценены.
     *
     * @param userId идентификатор пользователя
     * @return список идентификаторов оцененных пользователей
     */
    List<UUID> findRatedUserIds(UUID userId);

    /**
     * Оценить другого пользователя.
     *
     * @param userId       идентификатор пользователя, который оценивает
     * @param targetUserId идентификатор оцениваемого пользователя
     * @param reactionType тип реакции (лайк или дизлайк)
     * @return результат реакции, указывающий на исход взаимодействия
     */
    ReactionOutcome submitReaction(UUID userId, UUID targetUserId, ReactionType reactionType);
}